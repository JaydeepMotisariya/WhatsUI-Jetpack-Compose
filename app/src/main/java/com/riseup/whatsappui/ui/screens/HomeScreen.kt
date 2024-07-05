import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.riseup.whatsappui.data.INITIAL_SCREEN_INDEX
import com.riseup.whatsappui.data.tabs
import com.riseup.whatsappui.ui.components.AppBarComponent
import com.riseup.whatsappui.ui.components.TabsComponent
import com.riseup.whatsappui.ui.screens.CallsScreen
import com.riseup.whatsappui.ui.screens.ChatsScreen
import com.riseup.whatsappui.ui.screens.StatusScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState(pageCount = { tabs.size })
    val scope = rememberCoroutineScope()

    Column {
        AppBarComponent()
        TabsComponent(
            initialIndex = INITIAL_SCREEN_INDEX,
            pagerState = pagerState,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }

        )
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            when (page) {
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
        }
    }
}