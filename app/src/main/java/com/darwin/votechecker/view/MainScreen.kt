import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.darwin.votechecker.model.LocationData


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: ScraperViewModel = viewModel()) {

    val provinces = LocationData.provinces

    var provinceExpanded by remember { mutableStateOf(false) }
    var districtExpanded by remember { mutableStateOf(false) }
    var constituencyExpanded by remember { mutableStateOf(false) }

    var selectedProvince by remember { mutableStateOf(provinces.first()) }
    var selectedDistrict by remember { mutableStateOf(selectedProvince.districts.first()) }
    var selectedConstituency by remember { mutableStateOf(selectedDistrict.constituencies.first()) }

    LaunchedEffect(selectedConstituency) {
        viewModel.loadSite(selectedConstituency.alias)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // Province
            ExposedDropdownMenuBox(
                expanded = provinceExpanded,
                onExpandedChange = { provinceExpanded = !provinceExpanded },
                modifier = Modifier.weight(1f)
            ) {

                TextField(
                    value = selectedProvince.name,
                    onValueChange = {},
                    readOnly = true,
                    singleLine = true,
                    maxLines = 1,
                    label = { Text("Province") },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = provinceExpanded,
                    onDismissRequest = { provinceExpanded = false }
                ) {

                    provinces.forEach { province ->

                        DropdownMenuItem(
                            text = {
                                Text(
                                    province.name,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            },
                            onClick = {
                                selectedProvince = province
                                selectedDistrict = province.districts.first()
                                selectedConstituency = selectedDistrict.constituencies.first()
                                provinceExpanded = false
                            }
                        )
                    }
                }
            }

            // District
            ExposedDropdownMenuBox(
                expanded = districtExpanded,
                onExpandedChange = { districtExpanded = !districtExpanded },
                modifier = Modifier.weight(1f)
            ) {

                TextField(
                    value = selectedDistrict.name,
                    onValueChange = {},
                    readOnly = true,
                    singleLine = true,
                    maxLines = 1,
                    label = { Text("District") },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = districtExpanded,
                    onDismissRequest = { districtExpanded = false }
                ) {

                    selectedProvince.districts.forEach { district ->

                        DropdownMenuItem(
                            text = {
                                Text(
                                    district.name,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            },
                            onClick = {
                                selectedDistrict = district
                                selectedConstituency = district.constituencies.first()
                                districtExpanded = false
                            }
                        )
                    }
                }
            }

            // Constituency
            ExposedDropdownMenuBox(
                expanded = constituencyExpanded,
                onExpandedChange = { constituencyExpanded = !constituencyExpanded },
                modifier = Modifier.weight(1f)
            ) {

                TextField(
                    value = selectedConstituency.name,
                    onValueChange = {},
                    readOnly = true,
                    singleLine = true,
                    maxLines = 1,
                    label = { Text("Seat") },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = constituencyExpanded,
                    onDismissRequest = { constituencyExpanded = false }
                ) {

                    selectedDistrict.constituencies.forEach { c ->

                        DropdownMenuItem(
                            text = {
                                Text(
                                    c.name,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            },
                            onClick = {
                                selectedConstituency = c
                                constituencyExpanded = false
                            }
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        if (viewModel.loading) {
            CircularProgressIndicator()
            return@Column
        }

        if (viewModel.data.items.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Not Found")
            }
            return@Column
        }

        LazyColumn {
            item {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("Total Voter: ${viewModel.data.totalCount}")
                    Text("Male Voter: ${viewModel.data.maleCount}")
                    Text("Female Voter: ${viewModel.data.femaleCount}")

                }
            }
            items(viewModel.data.items) { item ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(12.dp)
                    ) {

                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(item.candidateImage)
                                    .addHeader("User-Agent", "Mozilla/5.0")
                                    .addHeader("Referer", "https://ratopati.com/")
                                    .build(),
                                contentDescription = item.candidateName,
                                modifier = Modifier.size(60.dp),
                                onError = {
                                    println("Image load failed: ${it.result.throwable}")
                                }
                            )

                            Spacer(Modifier.width(12.dp))

                            Column {
                                Text(item.candidateName)
                                Text(item.partyName)
                                Text("Votes: ${item.votes}")
                            }
                        }

                    }
                }
            }
        }
    }
}
