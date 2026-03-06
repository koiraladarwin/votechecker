import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.darwin.votechecker.model.ScrapedData
import com.darwin.votechecker.model.ScrapedItem
import kotlinx.coroutines.launch

class ScraperViewModel : ViewModel() {

    private val repo = ScraperRepository("https://election.ratopati.com/constituency")

    var data by mutableStateOf(
        ScrapedData(
            totalCount = "",
            maleCount = "",
            femaleCount = "",
            items = emptyList()
        )
    )
        private set

    var loading by mutableStateOf(false)
        private set

    fun loadSite(location: String) {
        viewModelScope.launch {

            Log.d("SCRAPER", "started")

            loading = true

            val result = repo.scrape(location)

            data = result

            Log.d("SCRAPER", result.toString())

            loading = false
        }
    }
}
