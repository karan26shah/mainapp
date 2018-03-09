package com.example.karan.mainapp.Utilities;

/**
 * Created by Karan on 23-02-2018.
 */

  import java.util.ArrayList;
  import java.util.List;

/**
 * Created by HBB20 on 7/14/15.
 * Recycler view provides flexibility to show items of multiple types....
 * this class will give flexibility to attach type of particular item so that it provide ease for providing layout.
 * later on along with itemType, many other property can be included as option.
 */
public class CommonRecyclerItem {
    private ItemType itemType;
    private Object item;
    private List<Object> options;

    public CommonRecyclerItem(ItemType itemType, Object item) {
        this.itemType = itemType;
        this.item = item;
    }

    public CommonRecyclerItem(ItemType itemType, Object item, Object... options) {
        this.itemType = itemType;
        this.item = item;
        this.options = new ArrayList<>();
        for (Object option : options) {
            this.options.add(option);
        }
    }

    public CommonRecyclerItem(ItemType itemType, Object item, List<Object> options) {
        this.itemType = itemType;
        this.item = item;
        this.options = options;
    }

    public static List<CommonRecyclerItem> generate(ItemType itemType, List<?> itemList, Object... options) {
        List<CommonRecyclerItem> commonRecyclerItems = new ArrayList<>();
        for (Object item : itemList) {
            commonRecyclerItems.add(new CommonRecyclerItem(itemType, item, options));
        }
        return commonRecyclerItems;
    }

    public static List<CommonRecyclerItem> generate(ItemType itemType, Object item, Object... options) {
        List<CommonRecyclerItem> commonRecyclerItems = new ArrayList<>();
        commonRecyclerItems.add(new CommonRecyclerItem(itemType, item, options));
        return commonRecyclerItems;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public enum ItemType {
        LOADING(0),
        CITY(1),
        CENTER(2),
        CO_COURSE(3),
        CO_OFFERING_TYPE(4),
        CO_CLASS_TIMINGS(5),
        TIMING_CLASS(6),
        SECTION_HEADER(7),
        ACK(8),
        ACK_CARD(9),
        CO_BOOK_TO_CARRY(10),
        CO_STUDY_PLAN(11),
        CO_BATCH_TIME(12),
        HOME_DATE(13),
        CITY_LIST_ITEM(14),
        CENTER_LIST_ITEM(15),
        CENTER_TOUR_ASSET(16),
        SV_CHANNEL(17),
        SV_PLAYLIST(18),
        SV_VIDEO_ITEM(19),
        IELTS_EXAM_DATE(20),
        COURSE_INFO(21),
        COURSE_NAME(22),
        EVENT(23),
        MOCK_TEST(24),
        COMMON_TITLE(25),
        MOCK_TEST_INSTRUCTION(26),
        BOOK(27),
        COMMON_CARD_TITLE(28),
        EEC_DOCUMENT(29),
        MOCK_TEST_DETAILS_CARD(30),
        USER_COURSE_SCORE(31),
        USER_SECTION_SCORE_LEFT(32),
        EXAM_TYPE(33),
        EXAM_BODY(34),
        //USER_SECTION_SCORE(35),
        SUCCESS_COURSE(35),
        SCORE_SECTION_INPUT(36),
        SCORE_VALUE(37),
        NOTIFIACTION(38),
        CREATE_ACCOUNT(39),
        CU_STATIC(40),
        CU_CITY_NAME(41),
        CU_CENTER(42),
        COMMON_SECTION_HEADER(43),
        USER_SECTION_SCORE_RIGHT(44),
        CS_PREF_COUNTRY(45),
        CS_PREF_SEMESTER(46),
        CS_PREF_COURSE_TYPE(47),
        CS_PREF_COURSE_CATEGORY(48),
        CS_PREF_COURSE_SUBCATEGORY(49),
        CS_COURSE(50),
        CS_COLLEGE(51),
        CS_CUSTOM_PROPERTY(52),
        CS_FILTER_MENU_ITEM(53),
        CS_FILTER_INPUT(54),
        CS_SINGLE_CHECK_BOX(55),
        CS_FILTER_CITY(56),
        CS_FILTER_CITY_SECTION_NAME(57),
        CS_FILTER_STATE(58),
        CS_FILTER_MENU_STATE(59),
        CS_FILTER_MENU_CITIES(60),
        CS_SORT_OPTION(61),
        MOCK_TEST_REGISTRATION(62),
        USER_SECTION_SCORE_CENTER(63),
        BANNER_PAGER(64),
        COLLEGE_DETAILS_CARD(65),
        CS_THUMB_MINI_IMAGE(66),
        CS_SECTION_HEADER(67),
        CS_COLLEGEPAGE_COURSE(68),
        CS_COLLEGEPAGE_GALLARY_PREVIEW(69),
        PREVIEW_THUMB(70),
        IMAGE_GALLERY_MINIMAP_THUMB(71),
        CS_COLLEGE_LIST_HEADER(72),
        EVENT_TEST_DETAILS_CARD(73),
        PRODUCT_INFO(74),
        EVENT_GALLERY_PREVIEW(75),
        MOCKTEST_GALLERY_PREVIEW(76),
        COURSE_OFFERING_NAME(77),
        CS_PREF_YEAR(78),
        EEC_REQUEST(79),
        COURSE_PAGE_IMG_SLICE_STATIC(80),
        COURSE_PAGE_IMG_SLICE(81),
        EEC_ORDERS(82),
        ENROLL_MENU(83),
        CU_COMPANYINFO(84);


        private final int id;

        ItemType(int value) {
            this.id = value;
        }

        public int getId() {
            return id;
        }

        public boolean matches(int id) {
            return this.id == id;
        }
    }
}


//conversion code
   /*

    total_entries = response.body().get("total_entries").getAsInt();
   JsonArray jsonArray = response.body().get(array_name).getAsJsonArray();
    Type listType = new TypeToken<ArrayList<classs>>() {
    }.getType();

    = new Gson().fromJson(jsonArray, listType);


    */

