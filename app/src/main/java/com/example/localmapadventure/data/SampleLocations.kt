package com.example.localmapadventure.data

import com.google.android.gms.maps.model.LatLng
import kotlin.random.Random
import java.time.LocalDate

data class LocalBusiness(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val position: LatLng
)

/**
 * 50 sample local businesses around San Marcos, Texas.
 * The app randomly picks 5 of them to show on the map each launch.
 */
object SampleLocations {

    // Approximate center of downtown San Marcos (near the Square / Courthouse)
    val mapCenter = LatLng(29.8833, -97.9414)

    private val allBusinesses = listOf(
        // Cafes & Coffee
        LocalBusiness(1, "The Coffee Bar", "Cafe", "Downtown specialty coffee & light bites", LatLng(29.8838, -97.9408)),
        LocalBusiness(2, "Redbud Roasters", "Cafe", "Organic, fair-trade coffee roasted locally", LatLng(29.8829, -97.9419)),
        LocalBusiness(3, "Tantra Coffeehouse", "Cafe", "Iconic purple house with porch seating & local music", LatLng(29.8845, -97.9395)),
        LocalBusiness(4, "Wake the Dead Coffee", "Cafe", "Artsy spot on Old Ranch Road 12", LatLng(29.8780, -97.9520)),
        LocalBusiness(5, "Archie's Coffee Lounge", "Cafe", "Coffee, cocktails & plant-based drinks", LatLng(29.8831, -97.9412)),
        LocalBusiness(6, "Lamppost Coffee", "Cafe", "Bright specialty coffee on Stagecoach Trail", LatLng(29.8755, -97.9350)),
        LocalBusiness(7, "Babe's Doughnut Co.", "Bakery", "Fresh doughnuts & coffee downtown", LatLng(29.8840, -97.9405)),
        LocalBusiness(8, "Mochas & Javas", "Cafe", "Popular study spot with iced lattes", LatLng(29.8825, -97.9425)),
        LocalBusiness(9, "Jo's Café", "Cafe", "Classic downtown comfort food & coffee", LatLng(29.8836, -97.9410)),
        LocalBusiness(10, "Fairview Coffee", "Cafe", "Cozy modern coffee on Chestnut", LatLng(29.8860, -97.9380)),

        // Restaurants & Food
        LocalBusiness(11, "Root Cellar Cafe", "Restaurant", "From-scratch local fare, patio seating", LatLng(29.8842, -97.9402)),
        LocalBusiness(12, "Blue Dahlia Bistro", "Restaurant", "European-inspired healthy breakfast & lunch", LatLng(29.8835, -97.9398)),
        LocalBusiness(13, "Gil's Broiler", "Restaurant", "Home of the famous Manske Rolls", LatLng(29.8848, -97.9400)),
        LocalBusiness(14, "Grin's Restaurant", "Restaurant", "Fried catfish & treehouse patio", LatLng(29.8855, -97.9415)),
        LocalBusiness(15, "Valentino's Pizza", "Restaurant", "Local pizza since 1981", LatLng(29.8839, -97.9411)),
        LocalBusiness(16, "Herbert's Taco Hut", "Restaurant", "Homemade tortillas & classic tacos", LatLng(29.8805, -97.9385)),
        LocalBusiness(17, "Palmer's Restaurant", "Restaurant", "Hill Country cuisine & courtyard", LatLng(29.8820, -97.9430)),
        LocalBusiness(18, "Gumby's Pizza", "Restaurant", "Creative local pies, including the Stoner Pie", LatLng(29.8828, -97.9435)),
        LocalBusiness(19, "CRAFTHouse Kitchen", "Restaurant", "Good food, drinks & downtown vibe", LatLng(29.8844, -97.9406)),
        LocalBusiness(20, "Blind Salamander", "Restaurant", "Colorful margaritas & tacos", LatLng(29.8846, -97.9403)),

        // Bookstores & Shops
        LocalBusiness(21, "Green Heron Bookshop", "Bookstore", "Victorian house with books, gifts & curios", LatLng(29.8830, -97.9420)),
        LocalBusiness(22, "The San Market", "Gift Shop", "Local gifts, crafts & San Marcos souvenirs", LatLng(29.8834, -97.9409)),
        LocalBusiness(23, "Barefoot San Marcos", "Apparel", "TXST & local apparel", LatLng(29.8837, -97.9413)),
        LocalBusiness(24, "KnD's Boutique", "Boutique", "Locally owned resale & fashion", LatLng(29.8841, -97.9407)),
        LocalBusiness(25, "Old Soul Exchange", "Vintage", "Vintage fashion, curio & retro décor", LatLng(29.8832, -97.9416)),
        LocalBusiness(26, "Daughter of the Wild", "Boutique", "Unique locally grown retail experience", LatLng(29.8827, -97.9418)),
        LocalBusiness(27, "Sundance Records", "Music", "Vinyl, music & local finds", LatLng(29.8843, -97.9399)),
        LocalBusiness(28, "Herbs & Oddities", "Specialty", "Herbs, teas, candles & tarot", LatLng(29.8833, -97.9422)),
        LocalBusiness(29, "Over the Moon Popcorn", "Specialty", "Gourmet popcorn & snacks", LatLng(29.8840, -97.9414)),
        LocalBusiness(30, "Two P's & Calli's", "Boutique", "Trendy fashion for all ages", LatLng(29.8838, -97.9404)),

        // More variety
        LocalBusiness(31, "Middleton Brewing", "Brewery", "Local craft beer", LatLng(29.8700, -97.9500)),
        LocalBusiness(32, "Roughhouse Brewing", "Brewery", "San Marcos craft brewery", LatLng(29.8650, -97.9450)),
        LocalBusiness(33, "Sean Patrick's Irish Pub", "Pub", "Irish pub & grub", LatLng(29.8822, -97.9428)),
        LocalBusiness(34, "Ivar's River Pub", "Pub", "Riverside drinks & food", LatLng(29.8790, -97.9360)),
        LocalBusiness(35, "Hays County Outfitters", "Outdoor", "Outdoor gear & local gear", LatLng(29.8850, -97.9390)),
        LocalBusiness(36, "Galaxy Bicycles", "Bike Shop", "Bikes & cycling gear", LatLng(29.8810, -97.9440)),
        LocalBusiness(37, "The Purple Toad", "Shop", "Unique local finds", LatLng(29.8835, -97.9417)),
        LocalBusiness(38, "Vagabond Vintage", "Vintage", "Vintage clothing & goods", LatLng(29.8826, -97.9401)),
        LocalBusiness(39, "Solidago Apothecary", "Specialty", "Apothecary & esoterica", LatLng(29.8847, -97.9397)),
        LocalBusiness(40, "Creeds & Crests", "Shop", "Local goods & gifts", LatLng(29.8839, -97.9421)),

        // Extra to reach 50
        LocalBusiness(41, "Café Cortado", "Cafe", "Specialty espresso downtown", LatLng(29.8830, -97.9406)),
        LocalBusiness(42, "Summer Moon Coffee", "Cafe", "Coffee in Springtown Center", LatLng(29.8900, -97.9300)),
        LocalBusiness(43, "Texas Bean & Brew", "Cafe", "Along the I-35 corridor", LatLng(29.9000, -97.9200)),
        LocalBusiness(44, "Triple Six Social", "Cafe", "Gothic café with curated books", LatLng(29.8824, -97.9415)),
        LocalBusiness(45, "The Sweet Spot", "Dessert", "Whimsical desserts & pink lattes", LatLng(29.8849, -97.9401)),
        LocalBusiness(46, "M&M Taco Corner", "Restaurant", "Classic local tacos", LatLng(29.8815, -97.9395)),
        LocalBusiness(47, "San Marcos BBQ", "Restaurant", "Local barbecue favorites", LatLng(29.8785, -97.9420)),
        LocalBusiness(48, "Italian Garden", "Restaurant", "Between the Square and campus", LatLng(29.8858, -97.9385)),
        LocalBusiness(49, "Shop 1893", "Boutique", "Historic building boutique", LatLng(29.8836, -97.9419)),
        LocalBusiness(50, "Trends & Traditions", "Gift Shop", "Gifts and local treasures", LatLng(29.8842, -97.9410)),

        //Historical Points
        LocalBusiness(51, "Hays County Courthouse", "Historic Landmark", "1908 Classical Revival courthouse, centerpiece of downtown", LatLng(29.8822, -97.9403)),
        LocalBusiness(52, "Charles S. Cock House", "Historic House", "1867 Greek Revival home, oldest remaining residential building", LatLng(29.8835, -97.9395)),
        LocalBusiness(53, "Eli T. Merriman Cabin", "Historic Cabin", "c.1846-1847 log cabin of one of San Marcos' founders", LatLng(29.8834, -97.9397)),
        LocalBusiness(54, "Veramendi Plaza", "Historic Park", "Park featuring the Cock House and Merriman Cabin", LatLng(29.8836, -97.9396)),
        LocalBusiness(55, "Old Main", "Historic Building", "1903 Victorian Gothic building, first of Southwest Texas State Normal School", LatLng(29.8892, -97.9386)),
        LocalBusiness(56, "First United Methodist Church", "Historic Church", "1893 Carpenter Gothic sanctuary, NRHP listed", LatLng(29.8830, -97.9425)),
        LocalBusiness(57, "The Calaboose", "Museum", "1873 first Hays County Jail, now African American history museum", LatLng(29.8815, -97.9420)),
        LocalBusiness(58, "Hays County Jail", "Historic Building", "Historic county jail building", LatLng(29.8804, -97.9424)),
        LocalBusiness(59, "Belvin Street Historic District", "Historic District", "Victorian and early 20th-century homes, National Register district", LatLng(29.8789, -97.9508)),
        LocalBusiness(60, "Barber House", "Historic House", "National Register listed historic residence", LatLng(29.8790, -97.9537)),
        LocalBusiness(61, "Augusta Hofheinz House", "Historic House", "1908 Classical Revival home, National Register", LatLng(29.8764, -97.9528)),
        LocalBusiness(62, "Ragsdale-Jackman-Yarbrough House", "Historic House", "1868 home of Republic of Texas veteran and later sheriff", LatLng(29.8811, -97.9492)),
        LocalBusiness(63, "Beverly Hutchison House", "Historic House", "Recorded Texas Historic Landmark on LBJ Drive", LatLng(29.8856, -97.9403)),
        LocalBusiness(64, "Basil Dailey House", "Historic House", "Early San Marcos residence, Recorded Texas Historic Landmark", LatLng(29.8811, -97.9444)),
        LocalBusiness(65, "Caldwell-Kone-Hyatt House", "Historic House", "Historic home on Hutchison Street", LatLng(29.8811, -97.9492)),
        LocalBusiness(66, "George Thomas McGehee House", "Historic House", "Victorian home on Belvin Street", LatLng(29.8800, -97.9500)),
        LocalBusiness(67, "George Henry Talmadge Home", "Historic House", "Historic residence on Belvin Street", LatLng(29.8800, -97.9511)),
        LocalBusiness(68, "Johnson House", "Historic House", "National Register listed home on Belvin Street", LatLng(29.8795, -97.9515)),
        LocalBusiness(69, "Kone-Cliett House", "Historic House", "Historic home on Burleson Street", LatLng(29.8805, -97.9510)),
        LocalBusiness(70, "Heard-Baker House", "Historic House", "National Register listed residence", LatLng(29.8794, -97.9480)),
        LocalBusiness(71, "Rylander-Kyle House", "Historic House", "National Register listed historic home", LatLng(29.8800, -97.9495)),
        LocalBusiness(72, "John Matthew Cape House", "Historic House", "Historic residence on Hopkins Street", LatLng(29.8820, -97.9450)),
        LocalBusiness(73, "Fort Street Presbyterian Church", "Historic Church", "Also known as Cumberland Presbyterian Church, Gothic Revival", LatLng(29.8815, -97.9470)),
        LocalBusiness(74, "Farmers Union Gin Company", "Historic Industrial", "Historic cotton gin complex", LatLng(29.8800, -97.9350)),
        LocalBusiness(75, "Belger-Cahill Lime Kiln", "Historic Industrial", "Historic lime kiln site", LatLng(29.8997, -97.9264)),
        LocalBusiness(76, "Burleson Homestead", "Historic Site", "1848 log home of Gen. Edward Burleson, Republic of Texas vice-president", LatLng(29.8947, -97.9303)),
        LocalBusiness(77, "LBJ Museum of San Marcos", "Museum", "Focuses on Lyndon B. Johnson’s college years in San Marcos", LatLng(29.8830, -97.9405)),
        LocalBusiness(78, "Spring Lake", "Historic Site", "One of the oldest continuously inhabited sites in North America", LatLng(29.8930, -97.9310)),
        LocalBusiness(79, "Aquarena Springs Site", "Historic Site", "Former amusement park and glass-bottom boat location", LatLng(29.8925, -97.9315)),
        LocalBusiness(80, "Hays County Courthouse Historic District", "Historic District", "Downtown commercial and governmental buildings around the square", LatLng(29.8825, -97.9403)),
        LocalBusiness(81, "Dunbar Historic District", "Historic District", "Historically African American neighborhood with residential and church buildings", LatLng(29.8810, -97.9435)),
        LocalBusiness(82, "Cephas House", "Historic House", "1920s home of Ulysses Cephas in the Dunbar neighborhood", LatLng(29.8805, -97.9440)),
        LocalBusiness(83, "Old First Baptist Church (Dunbar)", "Historic Church", "1908 church in the Dunbar Historic District", LatLng(29.8808, -97.9438)),
        LocalBusiness(84, "Fire Station and City Hall", "Historic Building", "Historic municipal building, National Register", LatLng(29.8820, -97.9410)),
        LocalBusiness(85, "Moore Grocery Company", "Historic Building", "Early commercial building downtown", LatLng(29.8818, -97.9400)),
        LocalBusiness(86, "Green and Faris Buildings", "Historic Building", "Late 19th-century commercial buildings on the square", LatLng(29.8828, -97.9408)),
        LocalBusiness(87, "McKie-Bass Building", "Historic Building", "Historic commercial structure downtown", LatLng(29.8830, -97.9412)),
        LocalBusiness(88, "Hardy-Williams Building", "Historic Building", "Contributing building in the Courthouse Historic District", LatLng(29.8833, -97.9407)),
        LocalBusiness(89, "San Marcos Telephone Company Building", "Historic Building", "Early 20th-century utility building", LatLng(29.8822, -97.9424)),
        LocalBusiness(90, "Old Fish Hatchery Office Building", "Historic Building", "Historic structure near the river", LatLng(29.8847, -97.9361)),
        LocalBusiness(91, "Cemetery Chapel", "Historic Chapel", "Chapel in the San Marcos Cemetery", LatLng(29.8750, -97.9450)),
        LocalBusiness(92, "Site of First Public Building", "Historic Site", "1847 log church-schoolhouse that later served as first courthouse", LatLng(29.8825, -97.9390)),
        LocalBusiness(93, "Site of Villa de San Marcos de Neve", "Historic Site", "Location of the original Spanish colonial settlement", LatLng(29.8850, -97.9350)),
        LocalBusiness(94, "Episcopalian Rectory", "Historic House", "Historic church-related residence", LatLng(29.8825, -97.9430)),
        LocalBusiness(95, "Fisher Hall", "Historic Building", "Early Texas State University related structure", LatLng(29.8880, -97.9390)),
        LocalBusiness(96, "Goforth-Harris House", "Historic House", "Historic residence near downtown", LatLng(29.8850, -97.9420)),
        LocalBusiness(97, "Old Storey Home", "Historic House", "Historic home on Burleson Street", LatLng(29.8817, -97.9506)),
        LocalBusiness(98, "Alexander Gates & Lillian Johnson Thomas House", "Historic House", "Historic home on Belvin Street", LatLng(29.8797, -97.9506)),
        LocalBusiness(99, "Robert Early McKie House", "Historic House", "1906 Italianate / Colonial Revival residence", LatLng(29.8820, -97.9480)),
        LocalBusiness(100, "Williams-Tarbutton House", "Historic House", "Historic residence in San Marcos", LatLng(29.8826, -97.9511)),
        LocalBusiness(101, "Cen-Tex Wool Mill Historic District", "Historic District", "Former Planters and Manufacturers Cotton Mill complex", LatLng(29.8700, -97.9400)),
        LocalBusiness(102, "San Marcos Milling Company", "Historic Industrial", "Historic milling site", LatLng(29.8758, -97.9383)),
        LocalBusiness(103, "Belvin Street Victorian Homes", "Historic District", "Concentration of Victorian homes from 1880–1910", LatLng(29.8790, -97.9510)),
        LocalBusiness(104, "Hays County Courthouse Square", "Historic Site", "The public square and surrounding commercial buildings", LatLng(29.8825, -97.9405)),
        LocalBusiness(105, "Johnnie Armstead African American History Museum", "Museum", "Located in the historic Calaboose building", LatLng(29.8815, -97.9420)),
        LocalBusiness(106, "Heritage Association of San Marcos", "Historic Site", "Operates Cottage Kitchen lunches at the Cock House", LatLng(29.8835, -97.9395)),
        LocalBusiness(107, "Texas State University Historic Core", "Historic Campus", "Early campus buildings including Old Main", LatLng(29.8890, -97.9385)),
        LocalBusiness(108, "Springlake Hotel Site", "Historic Site", "1928 hotel built by Paul Rogers, later Aquarena Springs", LatLng(29.8928, -97.9312)),
        LocalBusiness(109, "Glass-Bottom Boat Landing", "Historic Site", "Iconic Aquarena Springs feature on Spring Lake", LatLng(29.8932, -97.9308)),
        LocalBusiness(110, "Dunbar School Site", "Historic Site", "Early public school for Black children, founded 1877", LatLng(29.8805, -97.9445)),
        LocalBusiness(111, "First Hays County Courthouse Site", "Historic Site", "Location of the 1861 courthouse that burned in 1868", LatLng(29.8820, -97.9400)),
        LocalBusiness(112, "Second Hays County Courthouse Site", "Historic Site", "1871 wooden courthouse that later suffered structural failure", LatLng(29.8823, -97.9402)),
        LocalBusiness(113, "Third Hays County Courthouse Site", "Historic Site", "1882 courthouse destroyed by fire in 1908", LatLng(29.8822, -97.9403)),
        LocalBusiness(114, "Coronal Institute Area", "Historic Site", "Former school area that influenced Belvin Street development", LatLng(29.8785, -97.9520)),
        LocalBusiness(115, "San Marcos Riverwalk Historic Path", "Historic Site", "Tree-lined pathway connecting Veramendi Plaza to the river", LatLng(29.8838, -97.9385))
    )

    /** Returns 5 random businesses from the full list of 50 */
    fun getRandomBusinesses(count: Int = 5): List<LocalBusiness> {
        return allBusinesses.shuffled(Random(System.currentTimeMillis())).take(count)
    }

    /** Returns the same 3 businesses all day, then a new set the next day */
    fun getDailyBusinesses(count: Int = 5): List<LocalBusiness> {
        val today = LocalDate.now()
        val seed = today.toEpochDay()          // unique number for each day
        return allBusinesses.shuffled(Random(seed)).take(count)
    }
}
