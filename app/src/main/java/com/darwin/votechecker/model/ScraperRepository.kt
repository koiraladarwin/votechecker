import android.util.Log
import com.darwin.votechecker.model.ScrapedItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class ScraperRepository(private val url: String) {

    suspend fun scrape(location: String): List<ScrapedItem> {
        return withContext(Dispatchers.IO) {
            val items: MutableList<ScrapedItem> = mutableListOf()
            try {

                val doc = Jsoup.connect("$url/$location")
                    .userAgent("Mozilla/5.0")
                    .get()

                val links = doc.select(".party-container")

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

                items

            } catch (e: Exception) {
                Log.e("SCRAPER", "Scraping failed", e)
                emptyList()
            }
        }
    }
}

