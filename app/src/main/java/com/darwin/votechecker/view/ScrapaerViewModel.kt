import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.darwin.votechecker.model.ScrapedItem
import kotlinx.coroutines.launch

class ScraperViewModel : ViewModel() {

    private val repo = ScraperRepository("https://election.ratopati.com/constituency")

    var items by mutableStateOf<List<ScrapedItem>>(emptyList())
        private set

    var loading by mutableStateOf(false)
        private set

    fun loadSite(location: String) {
        viewModelScope.launch {
            Log.d("SCRAPER","started")
            loading = true
            Log.d("SCRAPER","loading true")
            items = repo.scrape(location)
            Log.d("SCRAPER",items.toString())
            loading = false
            Log.d("SCRAPER","loading false")
        }
    }
}
