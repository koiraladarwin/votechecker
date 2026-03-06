import android.util.Log
import androidx.compose.ui.Modifier
import com.darwin.votechecker.model.ScrapedData
import com.darwin.votechecker.model.ScrapedItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup
import org.jsoup.nodes.Element

class ScraperRepository(private val url: String) {

    suspend fun scrape(location: String): ScrapedData {
        return withContext(Dispatchers.IO) {

            val items = mutableListOf<ScrapedItem>()

            try {
                val doc = Jsoup.connect("$url/$location")
                    .userAgent("Mozilla/5.0")
                    .get()

                val stats = doc.select(".stats li")

                val total = stats.getOrNull(0)?.selectFirst("h5")?.ownText() ?: "0"
                val male = stats.getOrNull(1)?.selectFirst("h5")?.ownText() ?: "0"
                val female = stats.getOrNull(2)?.selectFirst("h5")?.ownText() ?: "0"

                val container = doc.selectFirst(".party-container-wrap")
                val links = container?.select(".party-container") ?: emptyList()

                for (link in links) {

                    val name = link.selectFirst(".party-name")?.text()

                    val img = link
                        .selectFirst(".party-logo img")
                        ?.absUrl("src")

                    val partyInfo = link
                        .selectFirst(".party-sign")
                        ?.text()

                    val partySign = link
                        .selectFirst(".party-sign img")
                        ?.absUrl("src")

                    val votes = link
                        .selectFirst(".votes")
                        ?.text()

                    items.add(
                        ScrapedItem(
                            candidateName = name ?: "",
                            candidateImage = img ?: "",
                            partyName = partyInfo ?: "",
                            partySymbol = partySign ?: "",
                            votes = votes ?: ""
                        )
                    )
                }

                ScrapedData(
                    totalCount = total,
                    maleCount = male,
                    femaleCount = female,
                    items = items
                )

            } catch (e: Exception) {
                Log.e("SCRAPER", "Scraping failed", e)

                ScrapedData(
                    totalCount = "",
                    maleCount = "",
                    femaleCount = "",
                    items = emptyList()
                )
            }
        }
    }
}
