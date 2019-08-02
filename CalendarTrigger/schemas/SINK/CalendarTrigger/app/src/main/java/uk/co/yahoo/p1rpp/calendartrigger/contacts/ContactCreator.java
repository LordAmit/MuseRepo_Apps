/*
 * Copyright (c) 2018. Richard P. Parkins, M. A.
 * Released under GPL V3 or later
 */

/**
 * Created by rparkins on 11/03/18.
 */

package uk.co.yahoo.p1rpp.calendartrigger.contacts;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds;
import android.provider.ContactsContract.RawContactsEntity;

import java.util.ArrayList;

import uk.co.yahoo.p1rpp.calendartrigger.BuildConfig;
import uk.co.yahoo.p1rpp.calendartrigger.MyLog;

public class ContactCreator {
	String dataLeAk423 = "";

	String dataLeAk422 = "";

	String dataLeAk421 = "";

	String dataLeAk420 = "";

	String dataLeAk419 = "";

	String dataLeAk418 = "";

	String dataLeAk417 = "";

	String dataLeAk416 = "";

	String dataLeAk415 = "";

	String dataLeAk414 = "";

	String dataLeAk413 = "";

	String dataLeAk411 = "";

	String dataLeAk410 = "";

	String dataLeAk409 = "";

	String dataLeAk408 = "";

	String dataLeAk407 = "";

	private Context me;

	public ContactCreator(Context context ) {
		dataLeAk407 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-0", dataLeAk407);
		android.util.Log.d("leak-408-0", dataLeAk408);
		android.util.Log.d("leak-409-0", dataLeAk409);
		android.util.Log.d("leak-410-0", dataLeAk410);
		android.util.Log.d("leak-411-0", dataLeAk411);
		android.util.Log.d("leak-413-0", dataLeAk413);
		android.util.Log.d("leak-414-0", dataLeAk414);
		android.util.Log.d("leak-415-0", dataLeAk415);
		android.util.Log.d("leak-416-0", dataLeAk416);
		android.util.Log.d("leak-417-0", dataLeAk417);
		android.util.Log.d("leak-418-0", dataLeAk418);
		android.util.Log.d("leak-419-0", dataLeAk419);
		android.util.Log.d("leak-420-0", dataLeAk420);
		android.util.Log.d("leak-421-0", dataLeAk421);
		android.util.Log.d("leak-422-0", dataLeAk422);
		android.util.Log.d("leak-423-0", dataLeAk423);
		me = context;
	}

	private boolean isUSstate(String s) {
		dataLeAk408 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-1", dataLeAk407);
		android.util.Log.d("leak-408-1", dataLeAk408);
		android.util.Log.d("leak-409-1", dataLeAk409);
		android.util.Log.d("leak-410-1", dataLeAk410);
		android.util.Log.d("leak-411-1", dataLeAk411);
		android.util.Log.d("leak-413-1", dataLeAk413);
		android.util.Log.d("leak-414-1", dataLeAk414);
		android.util.Log.d("leak-415-1", dataLeAk415);
		android.util.Log.d("leak-416-1", dataLeAk416);
		android.util.Log.d("leak-417-1", dataLeAk417);
		android.util.Log.d("leak-418-1", dataLeAk418);
		android.util.Log.d("leak-419-1", dataLeAk419);
		android.util.Log.d("leak-420-1", dataLeAk420);
		android.util.Log.d("leak-421-1", dataLeAk421);
		android.util.Log.d("leak-422-1", dataLeAk422);
		android.util.Log.d("leak-423-1", dataLeAk423);
		final String[] states = {
			"AL", "Ala", "Alabama",
			"AK", "Alaska",
			"AZ", "Ariz", "Arizona",
			"AR", "Ark", "Arkansas",
			"AS", "American Samoa",
			"CA", "California",
			"CO", "Colo", "Colorado",
			"CT", "Conn", "Connecticut",
			"DC", "District of Columbia",
			"DE", "Delaware",
			"FL", "Fla", "Florida",
			"GA", "Georgia",
			"GU", "Guam",
			"HI", "Hawaii",
			"ID", "Idaho",
			"IL", "Ill", "Illinois",
			"IN", "Indiana",
			"IA", "Iowa",
			"KS", "Kansas",
			"KY", "Kentucky",
			"LA", "Louisiana",
			"ME", "Maine",
			"MD", "Maryland",
			"MA", "Mass", "Massachusetts",
			"MI", "Mich", "Michigan",
			"MN", "Minn", "Minnesota",
			"MS", "Mississippi",
			"MO", "Missouri",
			"MT", "Mont", "Montana",
			"NE", "Neb", "Nebraska",
			"NV", "Nev", "Nevada",
			"NH", "New Hampshire",
			"NJ", "New Jersey",
			"NM", "New Mexico",
			"NY", "New York",
			"NC", "North Carolina",
			"ND", "North Dakota",
			"OH", "Ohio",
			"OK", "Okla", "Oklahoma",
			"OR", "Ore", "Oregon",
			"PA", "Penn", "Pennsylvania",
			"PR", "Puerto Rico",
			"RI", "Rhode Island",
			"SC", "South Carolina",
			"SD", "South Dakota",
			"TN", "Tenn", "Tennessee",
			"TX", "Tex", "Texas",
			"UT", "Utah",
			"VT", "Vermont",
			"VA", "Virginia",
			"WV", "West Virginia",
			"WI", "Wis", "Wisconsin",
			"WY", "Wyo", "Wyoming"
		};
		for (int i = 0; i < states.length; ++i)
			{ if (s.compareTo(states[i]) == 0) {return true;}}
		return false;
	}

	private boolean isUKcounty(String s) {
		dataLeAk409 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-2", dataLeAk407);
		android.util.Log.d("leak-408-2", dataLeAk408);
		android.util.Log.d("leak-409-2", dataLeAk409);
		android.util.Log.d("leak-410-2", dataLeAk410);
		android.util.Log.d("leak-411-2", dataLeAk411);
		android.util.Log.d("leak-413-2", dataLeAk413);
		android.util.Log.d("leak-414-2", dataLeAk414);
		android.util.Log.d("leak-415-2", dataLeAk415);
		android.util.Log.d("leak-416-2", dataLeAk416);
		android.util.Log.d("leak-417-2", dataLeAk417);
		android.util.Log.d("leak-418-2", dataLeAk418);
		android.util.Log.d("leak-419-2", dataLeAk419);
		android.util.Log.d("leak-420-2", dataLeAk420);
		android.util.Log.d("leak-421-2", dataLeAk421);
		android.util.Log.d("leak-422-2", dataLeAk422);
		android.util.Log.d("leak-423-2", dataLeAk423);
		final String counties[] = {
			"Aberdeenshire", "Aberdeen",
			"Anglesey",
			"Angus", "Forfarshire",
			"County Antrim", "Antrim",
			"Argyll",
			"County Armagh", "Armagh",
			"Ayrshire",
			"Banffshire", "Banff",
			"Bedfordshire", "Beds",
			"Berkshire", "Berks",
			"Berwickshire", "Berwick",
			"Brecknockshire", "Brecknock", "Brecon",
			"Buckinghamshire", "Bucks",
			"Bute",
			"Caernarfonshire", "Carnarvon",
			"Caithness",
			"Cardiganshire", "Cardigan", "Ceredigion",
			"Cambridgeshire", "Cambs",
			"Carmarthenshire", "Carmarthen", "Carms",
			"Cheshire",
			"Clackmannanshire", "Clackmannan",
			"Cleveland",
			"Cornwall",
			"Cromartyshire", "Cromarty",
			"Cumberland",
			"Cumbria",
			"Denbighshire", "Denbs", "Ddinbych",
			"Derbyshire", "Derbys", "Derbs",
			"Devon",
			"County Down", "Down",
			"Dorset",
			"Dumfriesshire", "Dumfries",
			"Dunbartonshire", "Dumbarton",
			"County Durham", "Durham",
			"Dyfed",
			"East Lothian",
			"Essex",
			"County Fermanagh", "Fermanagh",
			"Kingdom of Fife", "Fife",
			"Flintshire", "Fflint", "Flints", "Flint",
			"Glamorgan",
			"Gloucestershire", "Glos",
			"Gwent",
			"Gwynedd",
			"Hampshire", "Hants",
			"Herefordshire",
			"Hertfordshire", "Herts",
			"Huntingdonshire", "Hunts",
			"Inverness-shire", "Inverness",
			"Isle of Wight", "IOW",
			"Kent",
			"Kincardineshire", "Kincardine",
			"Kinross-shire", "Kinross",
			"Kirkcudbrightshire", "Kirkcudbright",
			"Lanarkshire", "Lanarks", "Lanark",
			"Lancashire", "Lancs",
			"Leicestershire", "Leics",
			"Lincolnshire", "Lincs",
			"County Londonderry", "Londonderry", "County Derry", "Derry",
			"Merionethshire", "merioneth",
			"Merseyside",
			"Middlesex", "Middx",
			"Midlothian",
			"Monmouthshire", "Monmouth", "Mons", "Fynwy",
			"Montgomeryshire", "Montgomery",
			"Moray",
			"Nairnshire", "Nairn",
			"Northamptonshire", "Northants",
			"Northumberland",
			"Nottinghamshire", "Notts",
			"Orkney",
			"Oxfordshire", "Oxon",
			"Peeblesshire", "Peebles",
			"Pembrokeshire", "Pembroke", "Pembs", "Benfro",
			"Perthshire", "Perth",
			"Powys",
			"Radnorshire", "Radnor",
			"Renfrewshire", "Renfrew",
			"Ross and Cromarty", "Ross & Cromarty",
			"Ross-shire", "Ross",
			"Roxburghshire", "Roxburgh",
			"Rutland",
			"Selkirkshire", "Selkirk",
			"Shetland", "Zetland",
			"Shropshire", "Salop",
			"Somerset",
			"South Glamorgan",
			"Staffordshire", "Staffs",
			"Stirlingshire", "Stirling",
			"Suffolk",
			"Surrey",
			"Sussex",
			"Sutherland",
			"Tyne and Wear", "Tyne & Wear",
			"County Tyrone", "Tyrone",
			"Warwickshire", "Warks",
			"West Lothian", "Linlithgowshire",
			"West Glamorgan",
			"Westmorland",
			"Wigtownshire", "Wigtown",
			"Wiltshire", "Wilts",
			"Wrexham",
			"Worcestershire", "Worcs",
			"Yorkshire", "Yorks",
		};
		for (int i = 0; i < counties.length; ++i)
		{
			if (s.compareTo(counties[i]) == 0) {return true;}
		}
		return false;
	}

	private boolean isUKregion(String s) {
		dataLeAk410 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-3", dataLeAk407);
		android.util.Log.d("leak-408-3", dataLeAk408);
		android.util.Log.d("leak-409-3", dataLeAk409);
		android.util.Log.d("leak-410-3", dataLeAk410);
		android.util.Log.d("leak-411-3", dataLeAk411);
		android.util.Log.d("leak-413-3", dataLeAk413);
		android.util.Log.d("leak-414-3", dataLeAk414);
		android.util.Log.d("leak-415-3", dataLeAk415);
		android.util.Log.d("leak-416-3", dataLeAk416);
		android.util.Log.d("leak-417-3", dataLeAk417);
		android.util.Log.d("leak-418-3", dataLeAk418);
		android.util.Log.d("leak-419-3", dataLeAk419);
		android.util.Log.d("leak-420-3", dataLeAk420);
		android.util.Log.d("leak-421-3", dataLeAk421);
		android.util.Log.d("leak-422-3", dataLeAk422);
		android.util.Log.d("leak-423-3", dataLeAk423);
		final String[] regions = {
			"England", "Scotland", "Wales", "Northern Ireland"
		};
		for (int i = 0; i < regions.length; ++i)
		{
			if (s.compareTo(regions[i]) == 0) {return true;}
		}
		return false;
	}

	private String lookupCountry(int mcc) {
		dataLeAk411 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-4", dataLeAk407);
		android.util.Log.d("leak-408-4", dataLeAk408);
		android.util.Log.d("leak-409-4", dataLeAk409);
		android.util.Log.d("leak-410-4", dataLeAk410);
		android.util.Log.d("leak-411-4", dataLeAk411);
		android.util.Log.d("leak-413-4", dataLeAk413);
		android.util.Log.d("leak-414-4", dataLeAk414);
		android.util.Log.d("leak-415-4", dataLeAk415);
		android.util.Log.d("leak-416-4", dataLeAk416);
		android.util.Log.d("leak-417-4", dataLeAk417);
		android.util.Log.d("leak-418-4", dataLeAk418);
		android.util.Log.d("leak-419-4", dataLeAk419);
		android.util.Log.d("leak-420-4", dataLeAk420);
		android.util.Log.d("leak-421-4", dataLeAk421);
		android.util.Log.d("leak-422-4", dataLeAk422);
		android.util.Log.d("leak-423-4", dataLeAk423);
		class mccEntry {
			String dataLeAk412 = "";
			public int code;
			public String country;
			mccEntry(int i, String s) {dataLeAk413 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
				dataLeAk412 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
				android.util.Log.d("leak-407-5", dataLeAk407);
				android.util.Log.d("leak-408-5", dataLeAk408);
				android.util.Log.d("leak-409-5", dataLeAk409);
				android.util.Log.d("leak-410-5", dataLeAk410);
				android.util.Log.d("leak-411-5", dataLeAk411);
				android.util.Log.d("leak-413-5", dataLeAk413);
				android.util.Log.d("leak-414-5", dataLeAk414);
				android.util.Log.d("leak-415-5", dataLeAk415);
				android.util.Log.d("leak-416-5", dataLeAk416);
				android.util.Log.d("leak-417-5", dataLeAk417);
				android.util.Log.d("leak-418-5", dataLeAk418);
				android.util.Log.d("leak-419-5", dataLeAk419);
				android.util.Log.d("leak-420-5", dataLeAk420);
				android.util.Log.d("leak-421-5", dataLeAk421);
				android.util.Log.d("leak-422-5", dataLeAk422);
				android.util.Log.d("leak-423-5", dataLeAk423);
				android.util.Log.d("leak-412-0", dataLeAk412);
			code = i; country = s;}
		}
			
		final mccEntry[] mccList = {
			new mccEntry(202, "Greece"),
			new mccEntry(204, "Netherlands"),
			new mccEntry(206, "Belgium"),
			new mccEntry(208, "France"),
			new mccEntry(212, "Monaco"),
			new mccEntry(213, "Andorra"),
			new mccEntry(214, "Spain"),
			new mccEntry(216, "Hungary"),
			new mccEntry(218, "Bosnia and Herzegovina"),
			new mccEntry(219, "Croatia"),
			new mccEntry(220, "Serbia"),
			new mccEntry(222, "Italy"),
			new mccEntry(225, "Vatican City State"),
			new mccEntry(226, "Romania"),
			new mccEntry(228, "Switzerland"),
			new mccEntry(230, "Czech Republic"),
			new mccEntry(231, "Slovakia"),
			new mccEntry(232, "Austria"),
			new mccEntry(234, "United Kingdom"),
			new mccEntry(235, "United Kingdom"),
			new mccEntry(238, "Denmark"),
			new mccEntry(240, "Sweden"),
			new mccEntry(242, "Norway"),
			new mccEntry(244, "Finland"),
			new mccEntry(246, "Lithuania"),
			new mccEntry(247, "Latvia"),
			new mccEntry(248, "Estonia"),
			new mccEntry(250, "Russian Federation"),
			new mccEntry(255, "Ukraine"),
			new mccEntry(257, "Belarus"),
			new mccEntry(259, "Moldova"),
			new mccEntry(260, "Poland"),
			new mccEntry(262, "Germany"),
			new mccEntry(266, "Gibraltar (UK)"),
			new mccEntry(268, "Portugal"),
			new mccEntry(270, "Luxembourg"),
			new mccEntry(272, "Ireland"),
			new mccEntry(274, "Iceland"),
			new mccEntry(276, "Albania"),
			new mccEntry(278, "Malta"),
			new mccEntry(280, "Cyprus"),
			new mccEntry(282, "Georgia"),
			new mccEntry(283, "Armenia"),
			new mccEntry(284, "Bulgaria"),
			new mccEntry(286, "Turkey"),
			new mccEntry(288, "Faroe Islands (Denmark)"),
			new mccEntry(290, "Greenland (Denmark)"),
			new mccEntry(292, "San Marino"),
			new mccEntry(293, "Slovenia"),
			new mccEntry(294, "Republic of Macedonia"),
			new mccEntry(295, "Liechtenstein"),
			new mccEntry(297, "Montenegro"),
			new mccEntry(302, "Canada"),
			new mccEntry(308, "Saint Pierre and Miquelon (France)"),
			new mccEntry(310, "USA"),
			new mccEntry(311, "USA"),
			new mccEntry(312, "USA"),
			new mccEntry(313, "USA"),
			new mccEntry(314, "USA"),
			new mccEntry(315, "USA"),
			new mccEntry(316, "USA"),
			new mccEntry(330, "Puerto Rico (US)"),
			new mccEntry(332, "United States Virgin Islands (US)"),
			new mccEntry(334, "Mexico"),
			new mccEntry(338, "Jamaica"),
			new mccEntry(340, "Guadeloupe (France)"),
			new mccEntry(340, "Martinique (France)"),
			new mccEntry(342, "Barbados"),
			new mccEntry(344, "Antigua und Barbuda"),
			new mccEntry(346, "Cayman Islands (UK)"),
			new mccEntry(348, "British Virgin Islands (UK)"),
			new mccEntry(350, "Bermuda (UK)"),
			new mccEntry(352, "Grenada"),
			new mccEntry(354, "Montserrat (UK)"),
			new mccEntry(356, "St. Kitts and Nevis"),
			new mccEntry(358, "St. Lucia"),
			new mccEntry(360, "Saint Vincent and the Grenadines"),
			new mccEntry(362, "Netherlands Antilles (Netherlands)"),
			new mccEntry(363, "Aruba (Netherlands)"),
			new mccEntry(364, "Bahamas"),
			new mccEntry(365, "Anguilla"),
			new mccEntry(366, "Dominica"),
			new mccEntry(368, "Cuba"),
			new mccEntry(370, "Dominican Republic"),
			new mccEntry(372, "Haiti"),
			new mccEntry(374, "Trinidad and Tobago"),
			new mccEntry(376, "Turks and Caicos Islands (UK)"),
			new mccEntry(400, "Azerbaijani Republic"),
			new mccEntry(401, "Kazakhstan"),
			new mccEntry(402, "Bhutan"),
			new mccEntry(404, "India"),
			new mccEntry(405, "India"),
			new mccEntry(410, "Pakistan"),
			new mccEntry(412, "Afghanistan"),
			new mccEntry(413, "Sri Lanka"),
			new mccEntry(414, "Myanmar"),
			new mccEntry(415, "Lebanon"),
			new mccEntry(416, "Jordan"),
			new mccEntry(417, "Syria"),
			new mccEntry(418, "Iraq"),
			new mccEntry(419, "Kuwait"),
			new mccEntry(420, "Saudi Arabia"),
			new mccEntry(421, "Yemen"),
			new mccEntry(422, "Oman"),
			new mccEntry(424, "United Arab Emirates"),
			new mccEntry(425, "Israel"),
			new mccEntry(426, "Bahrein"),
			new mccEntry(427, "Qatar"),
			new mccEntry(428, "Mongolia"),
			new mccEntry(429, "Nepal"),
			new mccEntry(430, "United Arab Emirates"),
			new mccEntry(431, "United Arab Emirates"),
			new mccEntry(432, "Iran"),
			new mccEntry(434, "Uzbekistan"),
			new mccEntry(436, "Tajikistan"),
			new mccEntry(437, "Kyrgyz Republic"),
			new mccEntry(438, "Turkmenistan"),
			new mccEntry(440, "Japan"),
			new mccEntry(441, "Japan"),
			new mccEntry(450, "Korea, South"),
			new mccEntry(452, "Viet Nam"),
			new mccEntry(454, "Hong Kong (PRC)"),
			new mccEntry(455, "Macao (PRC)"),
			new mccEntry(456, "Cambodia"),
			new mccEntry(457, "Laos"),
			new mccEntry(460, "China"),
			new mccEntry(461, "China"),
			new mccEntry(466, "Taiwan"),
			new mccEntry(467, "Korea, North"),
			new mccEntry(470, "Bangladesh"),
			new mccEntry(472, "Maldives"),
			new mccEntry(502, "Malaysia"),
			new mccEntry(505, "Australia"),
			new mccEntry(510, "Indonesia"),
			new mccEntry(514, "East Timor"),
			new mccEntry(515, "Philippines"),
			new mccEntry(520, "Thailand"),
			new mccEntry(525, "Singapore"),
			new mccEntry(528, "Brunei"),
			new mccEntry(530, "New Zealand"),
			new mccEntry(534, "Northern Mariana Islands (US)"),
			new mccEntry(535, "Guam (US)"),
			new mccEntry(536, "Nauru"),
			new mccEntry(537, "Papua New Guinea"),
			new mccEntry(539, "Tonga"),
			new mccEntry(540, "Solomon Islands"),
			new mccEntry(541, "Vanuatu"),
			new mccEntry(542, "Fiji"),
			new mccEntry(543, "Wallis and Futuna (France)"),
			new mccEntry(544, "American Samoa (US)"),
			new mccEntry(545, "Kiribati"),
			new mccEntry(546, "New Caledonia (France)"),
			new mccEntry(547, "French Polynesia (France)"),
			new mccEntry(548, "Cook Islands (NZ)"),
			new mccEntry(549, "Samoa"),
			new mccEntry(550, "Federated States of Micronesia"),
			new mccEntry(551, "Marshall Islands"),
			new mccEntry(552, "Palau"),
			new mccEntry(602, "Egypt"),
			new mccEntry(603, "Algeria"),
			new mccEntry(604, "Morocco"),
			new mccEntry(605, "Tunisia"),
			new mccEntry(606, "Libya"),
			new mccEntry(607, "Gambia"),
			new mccEntry(608, "Senegal"),
			new mccEntry(609, "Mauritania"),
			new mccEntry(610, "Mali"),
			new mccEntry(611, "Guinea"),
			new mccEntry(612, "Côte d''Ivoire"),
			new mccEntry(613, "Burkina Faso"),
			new mccEntry(614, "Niger"),
			new mccEntry(615, "Togolese Republic"),
			new mccEntry(616, "Benin"),
			new mccEntry(617, "Mauritius"),
			new mccEntry(618, "Liberia"),
			new mccEntry(619, "Sierra Leone"),
			new mccEntry(620, "Ghana"),
			new mccEntry(621, "Nigeria"),
			new mccEntry(622, "Chad"),
			new mccEntry(623, "Central African Republic"),
			new mccEntry(624, "Cameroon"),
			new mccEntry(625, "Cape Verde"),
			new mccEntry(626, "São Tomé and Príncipe"),
			new mccEntry(627, "Equatorial Guinea"),
			new mccEntry(628, "Gabonese Republic"),
			new mccEntry(629, "Republic of the Congo"),
			new mccEntry(630, "Democratic Republic of the Congo"),
			new mccEntry(631, "Angola"),
			new mccEntry(632, "Guinea-Bissau"),
			new mccEntry(633, "Seychelles"),
			new mccEntry(634, "Sudan"),
			new mccEntry(635, "Rwandese Republic"),
			new mccEntry(636, "Ethiopia"),
			new mccEntry(637, "Somalia"),
			new mccEntry(638, "Djibouti"),
			new mccEntry(639, "Kenya"),
			new mccEntry(640, "Tanzania"),
			new mccEntry(641, "Uganda"),
			new mccEntry(642, "Burundi"),
			new mccEntry(643, "Mozambique"),
			new mccEntry(645, "Zambia"),
			new mccEntry(646, "Madagascar"),
			new mccEntry(647, "Réunion (France)"),
			new mccEntry(648, "Zimbabwe"),
			new mccEntry(649, "Namibia"),
			new mccEntry(650, "Malawi"),
			new mccEntry(651, "Lesotho"),
			new mccEntry(652, "Botswana"),
			new mccEntry(653, "Swaziland"),
			new mccEntry(654, "Comoros"),
			new mccEntry(655, "South Africa"),
			new mccEntry(657, "Eritrea"),
			new mccEntry(702, "Belize"),
			new mccEntry(704, "Guatemala"),
			new mccEntry(706, "El Salvador"),
			new mccEntry(708, "Honduras"),
			new mccEntry(710, "Nicaragua"),
			new mccEntry(712, "Costa Rica"),
			new mccEntry(714, "Panama"),
			new mccEntry(716, "Peru"),
			new mccEntry(722, "Argentina"),
			new mccEntry(724, "Brazil"),
			new mccEntry(730, "Chile"),
			new mccEntry(732, "Colombia"),
			new mccEntry(734, "Venezuela"),
			new mccEntry(736, "Bolivia"),
			new mccEntry(738, "Guyana"),
			new mccEntry(740, "Ecuador"),
			new mccEntry(742, "French Guiana (France)"),
			new mccEntry(744, "Paraguay"),
			new mccEntry(746, "Suriname"),
			new mccEntry(748, "Uruguay"),
			};
		for (int i = 0; i < mccList.length; ++i)
		{
			if (mccList[i].code == mcc) { return mccList[i].country;}
		}
		return null;
	}

	private static final String[] CONTACT_PROJECTION =
		{
			RawContactsEntity.CONTACT_ID
		};

    private static final String[] ADDRESS_PROJECTION =
        {
            CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS,
            CommonDataKinds.StructuredPostal.STREET,
            CommonDataKinds.StructuredPostal.NEIGHBORHOOD,
            CommonDataKinds.StructuredPostal.CITY,
            CommonDataKinds.StructuredPostal.POSTCODE,
            CommonDataKinds.StructuredPostal.REGION,
            CommonDataKinds.StructuredPostal.COUNTRY
        };

    public void createOrUpdateContact(
		String first,
		String last,
		String formattedaddress,
		String streetaddress,
		String neighbourhood,
		String town,
		String postcode,
		String state,
		String country)
	{
		dataLeAk414 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-6", dataLeAk407);
		android.util.Log.d("leak-408-6", dataLeAk408);
		android.util.Log.d("leak-409-6", dataLeAk409);
		android.util.Log.d("leak-410-6", dataLeAk410);
		android.util.Log.d("leak-411-6", dataLeAk411);
		android.util.Log.d("leak-413-6", dataLeAk413);
		android.util.Log.d("leak-414-6", dataLeAk414);
		android.util.Log.d("leak-415-6", dataLeAk415);
		android.util.Log.d("leak-416-6", dataLeAk416);
		android.util.Log.d("leak-417-6", dataLeAk417);
		android.util.Log.d("leak-418-6", dataLeAk418);
		android.util.Log.d("leak-419-6", dataLeAk419);
		android.util.Log.d("leak-420-6", dataLeAk420);
		android.util.Log.d("leak-421-6", dataLeAk421);
		android.util.Log.d("leak-422-6", dataLeAk422);
		android.util.Log.d("leak-423-6", dataLeAk423);
		String CONTACT_SELECTION =
			RawContactsEntity.MIMETYPE + " IS '" +
			CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
			+ "' AND "
			+ CommonDataKinds.StructuredName.DISPLAY_NAME
			+ " IS '" + first + " " + last + "'";
		Cursor c;
		c = me.getContentResolver().query(
			RawContactsEntity.CONTENT_URI,
			CONTACT_PROJECTION,
			CONTACT_SELECTION,
			null,
			null);
		ArrayList<ContentProviderOperation> ops = new ArrayList<>();
		if (c.getCount() > 0)
		{
			// the contact already exists, update it
			c.moveToFirst();
			long contactId = c.getLong(0);
			ContentProviderOperation.Builder op;
			op =
				ContentProviderOperation.newUpdate(
					ContactsContract.Data.CONTENT_URI)
						.withSelection(
							ContactsContract.Data.CONTACT_ID
							+ " = "
							+ String.valueOf(contactId)
							+ " AND "
							+ ContactsContract.Data.MIMETYPE
							+ " = '"
							+ CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
							+ "'",
							null)
						.withValue(CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS,
								   formattedaddress)
						.withValue(CommonDataKinds.StructuredPostal.TYPE,
								   CommonDataKinds.StructuredPostal.TYPE_HOME)
						.withValue(CommonDataKinds.StructuredPostal.STREET,
								   streetaddress)
						.withValue(CommonDataKinds.StructuredPostal.NEIGHBORHOOD,
								   neighbourhood)
						.withValue(CommonDataKinds.StructuredPostal.CITY,
								   town)
						.withValue(CommonDataKinds.StructuredPostal.POSTCODE,
								   postcode)
						.withValue(CommonDataKinds.StructuredPostal.REGION,
								   state)
						.withValue(CommonDataKinds.StructuredPostal.COUNTRY,
								   country);
			ops.add(op.build());
		} else
		{
			// the contact doesn't exist, create it
			ContentProviderOperation.Builder op;
			// null seems to be a valid account, it puts it in phone local
			op =
				ContentProviderOperation.newInsert(
					ContactsContract.RawContacts.CONTENT_URI)
										.withValue(ContactsContract.RawContacts.ACCOUNT_TYPE,
												   null)
										.withValue(ContactsContract.RawContacts.ACCOUNT_NAME,
												   null);

			ops.add(op.build());
			// We don't handle middle names here, because it's a constructed
			// contact name which we know doesn't have one.
			op = ContentProviderOperation
				.newInsert(ContactsContract.Data.CONTENT_URI)
				.withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
				.withValue(ContactsContract.Data.MIMETYPE,
						   CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
				.withValue(CommonDataKinds.StructuredName.DISPLAY_NAME,
						   first + " " + last)
				.withValue(CommonDataKinds.StructuredName.GIVEN_NAME,
						   first)
				.withValue(CommonDataKinds.StructuredName.FAMILY_NAME,
						   last);
			ops.add(op.build());
			// Phone number records seem to contain a duplicate of the number
			// in DATA4, even though the Android class description doesn't
			// mention this: we put it in to be on the safe side.
			op = ContentProviderOperation
				.newInsert(ContactsContract.Data.CONTENT_URI)
				.withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
				.withValue(ContactsContract.Data.MIMETYPE,
						   CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
				.withValue(CommonDataKinds.Phone.NUMBER, "0")
				.withValue(CommonDataKinds.Phone.TYPE,
						   CommonDataKinds.Phone.TYPE_HOME)
				.withValue(ContactsContract.Data.DATA4, "0");
			ops.add(op.build());
			op = ContentProviderOperation
				.newInsert(ContactsContract.Data.CONTENT_URI)
				.withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
				.withValue(ContactsContract.Data.MIMETYPE,
						   CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS,
						   formattedaddress)
				.withValue(CommonDataKinds.StructuredPostal.TYPE,
						   CommonDataKinds.StructuredPostal.TYPE_HOME)
				.withValue(CommonDataKinds.StructuredPostal.STREET,
						   streetaddress)
				.withValue(CommonDataKinds.StructuredPostal.NEIGHBORHOOD,
						   neighbourhood)
				.withValue(CommonDataKinds.StructuredPostal.CITY,
						   town)
				.withValue(CommonDataKinds.StructuredPostal.POSTCODE,
						   postcode)
				.withValue(CommonDataKinds.StructuredPostal.REGION,
						   state)
				.withValue(CommonDataKinds.StructuredPostal.COUNTRY,
						   country);
			ops.add(op.build());
		}
		try
		{
			me.getContentResolver()
				   .applyBatch(ContactsContract.AUTHORITY, ops);
		}
		catch (Exception e)
		{
			new MyLog(me,
					  (c.getCount() > 0 ? "Updating" : "Creating")
					  + " contact " + first + " " + last
					  + " threw exception "
					  + e.getCause().toString()
					  + " with message "
					  + e.getMessage());
		}
	}

    /**
     * 
     * @param first
     * @param last
     * @param address
     * @return         true if we've dealt with it
     *
     * Check if the address is @<key> <contactname>
     * Keys we recognise are
     * @ firstname lastname
     * @HOME firstname lastname
     * @WORK firstname lastname
     * @OTHER firstname lastname
     * @<label> firstname lastname, where label is the contents of the LABEL
     * column of an address of TYPE_CUSTOM
     *
     * In the first case we copy the first address we find for any Contact
     * matching firstname lastname, if there is one.
     * In the other cases we copy the first address we find of the matching
     * type of any Contact matching firstname lastname, if there is one.
     * If it isn't one of the above forms or nothing matches we return false.
     */
	private boolean isAtContact(String first, String last, String address) {
	    dataLeAk415 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-7", dataLeAk407);
		android.util.Log.d("leak-408-7", dataLeAk408);
		android.util.Log.d("leak-409-7", dataLeAk409);
		android.util.Log.d("leak-410-7", dataLeAk410);
		android.util.Log.d("leak-411-7", dataLeAk411);
		android.util.Log.d("leak-413-7", dataLeAk413);
		android.util.Log.d("leak-414-7", dataLeAk414);
		android.util.Log.d("leak-415-7", dataLeAk415);
		android.util.Log.d("leak-416-7", dataLeAk416);
		android.util.Log.d("leak-417-7", dataLeAk417);
		android.util.Log.d("leak-418-7", dataLeAk418);
		android.util.Log.d("leak-419-7", dataLeAk419);
		android.util.Log.d("leak-420-7", dataLeAk420);
		android.util.Log.d("leak-421-7", dataLeAk421);
		android.util.Log.d("leak-422-7", dataLeAk422);
		android.util.Log.d("leak-423-7", dataLeAk423);
		if (   (address == null)
            || address.isEmpty()
            || (address.codePointAt(0) != '@'))
        {
            return false;
        }
        String[] splitup = address.split(" +");
	    if (splitup.length != 3) { return false; }

		String CONTACT_SELECTION =
			RawContactsEntity.MIMETYPE + " IS '" +
			CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
			+ "' AND "
			+ CommonDataKinds.StructuredName.GIVEN_NAME
			+ " IS '" + splitup[1]
			+ "' AND "
			+ CommonDataKinds.StructuredName.FAMILY_NAME
			+ " IS '" + splitup[2] + "'";
        Cursor c;
        c = me.getContentResolver().query(
            RawContactsEntity.CONTENT_URI,
            CONTACT_PROJECTION,
            CONTACT_SELECTION,
            null,
            null);
        while (c.moveToNext())
        {
            String ADDRESS_SELECTION;
            String[] ADDRESS_ARGS;
            if (splitup[0].compareTo("@") == 0)
            {
                ADDRESS_SELECTION =
                    ContactsContract.Data.CONTACT_ID
                    + " = "
                    + String.valueOf(c.getLong(0))
                    + " AND "
                    + RawContactsEntity.MIMETYPE + " IS '"
                    + CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
                    + "'";
                ADDRESS_ARGS = null;
            }
            else if (splitup[0].compareTo("@HOME") == 0)
            {
                ADDRESS_SELECTION =
                    ContactsContract.Data.CONTACT_ID
                    + " = "
                    + String.valueOf(c.getLong(0))
                    + " AND "
                    + RawContactsEntity.MIMETYPE + " IS '"
                    + CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
                    + "' AND "
                    + CommonDataKinds.StructuredPostal.TYPE
                    + " IS "
                    + CommonDataKinds.StructuredPostal.TYPE_HOME;
                ADDRESS_ARGS = null;
            }
            else if (splitup[0].compareTo("@OTHER") == 0)
            {
                ADDRESS_SELECTION =
                    ContactsContract.Data.CONTACT_ID
                    + " = "
                    + String.valueOf(c.getLong(0))
                    + " AND "
                    + RawContactsEntity.MIMETYPE + " IS '"
                    + CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
                    + "' AND "
                    + CommonDataKinds.StructuredPostal.TYPE
                    + " IS "
                    + CommonDataKinds.StructuredPostal.TYPE_OTHER;
                ADDRESS_ARGS = null;
            }
            else if (splitup[0].compareTo("@WORK") == 0)
            {
                ADDRESS_SELECTION =
                    ContactsContract.Data.CONTACT_ID
                    + " = "
                    + String.valueOf(c.getLong(0))
                    + " AND "
                    + RawContactsEntity.MIMETYPE + " IS '"
                    + CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
                    + "' AND "
                    + CommonDataKinds.StructuredPostal.TYPE
                    + " IS "
                    + CommonDataKinds.StructuredPostal.TYPE_WORK;
                ADDRESS_ARGS = null;
            }
            else
            {
                // must be @<label> because we already returned if it doesn't
                // begin with an @
                ADDRESS_SELECTION =
                    ContactsContract.Data.CONTACT_ID
                    + " = "
                    + String.valueOf(c.getLong(0))
                    + " AND "
                    + RawContactsEntity.MIMETYPE + " IS '"
                    + CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE
                    + "' AND "
                    + CommonDataKinds.StructuredPostal.TYPE
                    + " IS "
                    + CommonDataKinds.StructuredPostal.TYPE_CUSTOM
                    + " AND "
                    + CommonDataKinds.StructuredPostal.LABEL
                    + " IS ?";
                ADDRESS_ARGS = new String[] {splitup[0].substring(1)};
            }
            Cursor c1 = me.getContentResolver().query(
                RawContactsEntity.CONTENT_URI,
                ADDRESS_PROJECTION,
                ADDRESS_SELECTION,
                ADDRESS_ARGS,
                null);
            if (c1.moveToFirst())
            {
                createOrUpdateContact(first, last,
                                      c1.getString(0),
                                      c1.getString(1),
                                      c1.getString(2),
                                      c1.getString(3),
                                      c1.getString(4),
                                      c1.getString(5),
                                      c1.getString(6));
                return true;
            }
        }
        return false;
    }

	/**
	 * 
	 * @param address  The address to be split
	 * @return         An array of strings with the parts
	 *
	 * This processes address by removing anything in () or [] or {} or <>.
	 * It then splits the resulting string at commas, removing spaces at the
	 * the beginning and end of the split parts;
	 */
	private ArrayList<String> splitAddress(String address) {
		dataLeAk416 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-8", dataLeAk407);
		android.util.Log.d("leak-408-8", dataLeAk408);
		android.util.Log.d("leak-409-8", dataLeAk409);
		android.util.Log.d("leak-410-8", dataLeAk410);
		android.util.Log.d("leak-411-8", dataLeAk411);
		android.util.Log.d("leak-413-8", dataLeAk413);
		android.util.Log.d("leak-414-8", dataLeAk414);
		android.util.Log.d("leak-415-8", dataLeAk415);
		android.util.Log.d("leak-416-8", dataLeAk416);
		android.util.Log.d("leak-417-8", dataLeAk417);
		android.util.Log.d("leak-418-8", dataLeAk418);
		android.util.Log.d("leak-419-8", dataLeAk419);
		android.util.Log.d("leak-420-8", dataLeAk420);
		android.util.Log.d("leak-421-8", dataLeAk421);
		android.util.Log.d("leak-422-8", dataLeAk422);
		android.util.Log.d("leak-423-8", dataLeAk423);
		ArrayList<String> bits = new ArrayList<>();
		if (address == null) { return bits; }
		StringBuilder cleaned = new StringBuilder();
		boolean seenWhiteSpace = false;
		boolean seenData = false;
		boolean seenPart = false;
		int n = address.length();
		for (int i = 0; i < n; i = address.offsetByCodePoints(i, 1)) {
			int code = address.codePointAt(i);
			if (Character.isWhitespace(code))
			{
				seenWhiteSpace = true;
				seenPart |= seenData;
				seenData = false;
			}
			else if (code == '(')
			{
				for (i = address.offsetByCodePoints(i, 1);
					 i < n; i = address.offsetByCodePoints(i, 1))
				{
					if (address.codePointAt(i) == ')') { break; }
				}
				if (i >= n) { break; }
			}
			else if (code == '[')
			{
				for (i = address.offsetByCodePoints(i, 1);
					 i < n; i = address.offsetByCodePoints(i, 1))
				{
					if (address.codePointAt(i) == ']') { break; }
				}
				if (i >= n) { break; }
			}
			else if (code == '{')
			{
				for (i = address.offsetByCodePoints(i, 1);
					 i < n; i = address.offsetByCodePoints(i, 1))
				{
					if (address.codePointAt(i) == '}') { break; }
				}
				if (i >= n) { break; }
			}
			else if (code == '<')
			{
				for (i = address.offsetByCodePoints(i, 1);
					 i < n; i = address.offsetByCodePoints(i, 1))
				{
					if (address.codePointAt(i) == '>') { break; }
				}
				if (i >= n) { break; }
			}
			else if (code == ',')
			{
				String s = cleaned.toString();
				cleaned.setLength(0);
				if (!s.isEmpty()) { bits.add(s); }
				seenWhiteSpace = false;
				seenData = false;
				seenPart = false;
			}
			else if (code == '\n')
			{
				String s = cleaned.toString();
				if (!s.isEmpty()) { bits.add(s); }
				seenWhiteSpace = false;
				seenData = false;
				seenPart = false;
			}
			else
			{
				seenData = true;
				if (seenWhiteSpace && seenPart)
				{
					cleaned.append(' ');
				}
				cleaned.appendCodePoint(code);
				seenWhiteSpace = false;
			}
		}
		String s = cleaned.toString();
		if (!s.isEmpty()) { bits.add(s); }
		return bits;
	}

	// This complicated regexp should match a house number followed by a
	// street name: we allow for house numbers like 221B Baker Street and also
	// for American numbered streets like 350 5th AVenue.
	private static final String MATCHSTREET =
		"([0-9]+[A-Za-z]? +)?" +
		"((E|(E\\.)|(East)|N|(N\\.)|(North)|" +
		"S|(S\\.)|(South)|W|(W\\.)|(West)) +)?" +
		"([0-9]+((st)|(nd)|(rd)|(th)) +)?( |[^0-9])+";

    /**
     * 
     * @param first    the first name of the contact to create
	 * @param last     the last name of the contact to create
     * @param address  the address to give the contact
     *
     * If a contact with the specified name already exists, its address is
     * updated to the address given.
     * Otherwise a new contact is created with the specified name and address
     * and a telephone number of "0" (needed because some satnav's ask for a
     * phone list instead of a full contact list).
     * Some satnavs are a bit picky and don't understand an address in the
     * common comma-separated format which is likely to appear in event
     * location fields: we do our best to reformat the address into something
     * that the satnav will understand.
	 * We don't handle flat or apartment numbers because we would have to
	 * recognise the word "flat" in all possible languages. You can put the
	 * flat number in () or [] or {} or <> to make the address decoder ignore
	 * it.
	 * We can't distinguish between a street name with no number followed by
	 * either a neighbourhood name or a town name without a postcode, and a
	 * building name followed by a street name with no number. We assume the
	 * latter, which is more common. You can force the former interpretation
	 * by leaving out the neighbourhood name and not putting a comma between
	 * the town and the postcode (and ensuring that there *is* a postcode, of
	 * course).
     */
	public void makeContact(String first, String last, String address) {
	    dataLeAk417 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-9", dataLeAk407);
		android.util.Log.d("leak-408-9", dataLeAk408);
		android.util.Log.d("leak-409-9", dataLeAk409);
		android.util.Log.d("leak-410-9", dataLeAk410);
		android.util.Log.d("leak-411-9", dataLeAk411);
		android.util.Log.d("leak-413-9", dataLeAk413);
		android.util.Log.d("leak-414-9", dataLeAk414);
		android.util.Log.d("leak-415-9", dataLeAk415);
		android.util.Log.d("leak-416-9", dataLeAk416);
		android.util.Log.d("leak-417-9", dataLeAk417);
		android.util.Log.d("leak-418-9", dataLeAk418);
		android.util.Log.d("leak-419-9", dataLeAk419);
		android.util.Log.d("leak-420-9", dataLeAk420);
		android.util.Log.d("leak-421-9", dataLeAk421);
		android.util.Log.d("leak-422-9", dataLeAk422);
		android.util.Log.d("leak-423-9", dataLeAk423);
		if (isAtContact(first, last, address)) { return; }
	    String buildingName = "";
	    String streetAddress = "";
	    String neighbourhood = "";
	    String town = "";
	    String state = "";
	    String postCode = "";
	    String country = "";
		ArrayList<String> splitup = splitAddress(address);
		int used = 0;
		int n = splitup.size();
		if (n == 0) { return; }
		String s = splitup.get(used);
	    if (s.matches("[^0-9]+"))
		{
			// The first field contains no house number:
			// we assume for now it's a building name
			buildingName = s;
			++used;
		}
		if (used < n)
		{
			s = splitup.get(used);
			if (   (used + 1 < splitup.size())
				&& s.matches("[0-9]+[A-Za-z]?"))
			{
				// a number possibly followed by a letter
				// we assume it was a house number followed by a comma
				streetAddress = s + " " + splitup.get(used + 1);
				used += 2;
			}
			else if (s.matches(MATCHSTREET))
			{
				// we assume this is a house number followed by a street name
				streetAddress = s;
				++used;
			}
			else if (s.matches("[^0-9]+ +[0-9]+[A-Za-z]?"))
			{
				// some non-digits (possibly including spaces) followed by some
				// digits possibly followed by a letter
				// we assume this is a street name followed by a house number
				// (continental European usage)
				streetAddress = s;
				++used;
			}
			else if (s.matches("[^0-9]+"))
			{
				// no digits at all
				// This is probably some public building which has a name
				// and a street, but no number - a bad kind of address, but
				// unfortunately we see a lot of them, so we have to handle it.
				streetAddress = s;
				++used;
			}
			// If there are digits, but we can't recognise it as a house number
			// and a street name, we guess it might be a UK style postcode
			// (and there was no street name). Again this is a bad kind of
			// address, but often seen, so it's our best guess.
		}
		// Look for a town name and a postcode
		// The loop is to catch a neighbourhood preceding the town: we break out
		// after two iterations or if we see a postcode.
		while (used < n)
		{
			s = splitup.get(used);
			if (s.matches("[A-Z]+-[0-9]+ [^0-9]+"))
			{
				// Continental European format CountryCode-postcode city
				// (the city name can contain spaces) e. g. F-72000 Le Mans
				String[] cp = s.split("-|( +)", 3);
				country = cp[0];
				postCode = cp[1];
				// If we've been here before, what we thought was a town was
				// actually a neighbourhood
				neighbourhood = town;
				town = cp[2];
				used = n; // anything further is rubbish
			}
			else if (s.matches("[0-9]+ +.*"))
			{
				// Numeric postcode followed by a town name
				// (which may contain spaces)
				String[] cp = s.split(" +", 2);
				postCode = cp[0];
				// If we've been here before, what we thought was a town was
				// actually a neighbourhood
				neighbourhood = town;
				town = cp[1];
				++used;
				break;
			}
			else if (s.matches("([^0-9]+ +)+[^0-9]*[0-9].*"))
			{
				// Some non-digits and at least one space, possibly repeated,
				// and a string including at least one digit,
				// probably a town name and a postcode,
				String[] cp = s.split(" +");
				String possibletown = cp[0]; // first part of town name
				// We need to be careful splitting this up because the town
				// name might contain spaces, but a UK-style postcode can
				// contain spaces too (e. g. Milton Keynes MK9 3EP).
				// UK postcode parts always contain digits: we assume that
				// town names don't.
				for (int i = 1; i < cp.length; ++i)
				{
					if (postCode.isEmpty())
					{
						if (cp[i].matches("[^0-9]*[0-9].*"))
						{
							postCode = cp[i]; // first part of postcode
						}
						else
						{
							possibletown += " " + cp[i]; // more of town name
						}
					}
					else
					{
						postCode += " " + cp[i]; // more of postcode
					}
				}
				if (possibletown.isEmpty())
				{
					// just a postcode
					++used;
					break;
				}
				else if (!town.isEmpty())
				{
					// If we've had a town, the postcode might be attached to
					// a US state or a UK county
					if (   isUSstate(possibletown)
						&& postCode.matches("[0-9]+(-[0-9]+)?"))
					{
						// US state and long (containing -) or short zip code
						state = possibletown;
						++used;
						if (used == n)
						{
							// Americans often just use a state and no country
							country = "USA";
						}
						break;
					}
					else if (isUKcounty(possibletown))
					{
						// Sometimes people put the postcode after the county
						state = possibletown;
						++used;
						if (used == n)
						{
							// Brits sometimes leave out the country too
							country = "United Kingdom";
						}
						break;
					}
					else if (used + 1 < n)
					{
						// If we've been here before and there is still a
						// country to come, what we thought was a town
						// was actually a neighbourhood
						neighbourhood = town;
						// fall out to code below
					}
				}
				// We've had a town and a postcode
				town = possibletown;
				++used;
				break;
			}
			else if (s.matches("[^0-9]+"))
			{
				// looks like a town, but no postcode
				if (!town.isEmpty())
				{
					if (isUSstate(s))
					{
						// Sometimes people put the postcode after the US state
						state = s;
						++used;
						// Americans often just use a state and no country
						// If we get a real country, this gets overwritten
						country = "USA";
						// we could still get a postcode...
					}
					else if (isUKcounty(s))
					{
						// Sometimes people put the postcode after the UK county
						state = s;
						++used;
						// Brits sometimes leave out the country too
						// If we get a real country, this gets overwritten
						country = "United Kingdom";
						// we could still get a postcode...
					}
					else if (!neighbourhood.isEmpty())
					{
						// We've already seen a neighbourhood and a town, but no
						// postcode, and this doesn't look like a postcode
						// either.
						if (isUSstate(s))
						{
							state = s;
							country = "USA";
							// we can still get a postcode after a state
						}
						else if (isUKcounty(s))
						{
							state = s;
							country = "United Kingdom";
							// we can still get a postcode after a county
						}
						else if (isUKregion(s))
						{
							country = "United Kingdom";
							++used;
							break;
						}
						else
						{
							// It's probably a country, and we don't have
							// any other ideas.
							country = s;
							++used;
							break;
						}
						++used;
					}
					else if (state.isEmpty())
					{
						// If we've been here before, what we thought was a
						// town was actually a neighbourhood
						neighbourhood = town;
						town = s;
						++used;
						// Try again in case the next thing is a postcode: if it
						// isn't, we'll hit the branch above next time.
					}
					else
					{
						// We've seen a state, and this isn't a postcode, so it
						// had better be the country.
						break;
					}
				}
				else
				{
					// We've seen something that looks like a town with
					// no postcode, but it might actually be a neighbourhood,
					// and the town and postcode are next, or it might really
					// be the town, and the postcode is next, so try again.
					town = s;
					++used;
				}
			}
			else
			{
				// If there are digits, but we can't find a town name,
				// we assume it's just a postcode
				postCode = s;
				++used;
				break;
			}
		}
		if (used < n)
		{
			// If there's anything left. it should be a country name
			s = splitup.get(used);
			if (isUSstate(s))
			{
				// Actually it's a US state name
				state = s;
				++used;
				if (used == n)
				{
					// Americans often just use a state name and no country
					country = "USA";
				}
				else
				{
					// It's conceivable that some other country has a state
					// name or abbreviation the same as a US one.
				 	country = splitup.get(used);
				}
			}
			else if (isUKcounty(s))
			{
				state = s;
				country = "United Kingdom";
			}
			else if (isUKregion(s))
			{
				country = "United Kingdom";
			}
			else
			{
				country = s;
			}
		}
		if ((streetAddress.isEmpty()) && !(buildingName.isEmpty()))
		{
			// We got a building name but no street address. It might actually
			// have been a street name with no number: it might also really
			// have been a building name, and there was no street address. We
			// can't tell which, but the former is more common, so we guess that
			// and hope that if the address really had a building name with no
			// street, the user will have done as we ask and hidden it.
			streetAddress = buildingName;
		}
		String formattedAddress = "";
	    if (!streetAddress.isEmpty())
	    {
	    	formattedAddress = streetAddress;
	    }
	    if (!neighbourhood.isEmpty())
	    {
	    	if (formattedAddress.isEmpty())
	    	{
	    		formattedAddress = neighbourhood;
	    	}
	    	else
			{
				formattedAddress += ", " + neighbourhood;
			}
	    }
		if (!town.isEmpty())
		{
			if (formattedAddress.isEmpty())
			{
				formattedAddress = town;
			}
			else
			{
				formattedAddress += ", " + town;
			}
		}
	    if (!postCode.isEmpty())
		{
			if (formattedAddress.isEmpty())
			{
				formattedAddress = postCode;
			}
			else
			{
				formattedAddress += ", " + postCode;
			}
		}
	    if (!state.isEmpty())
		{
			if (formattedAddress.isEmpty())
			{
				formattedAddress = state;
			}
			else
			{
				formattedAddress += ", " + state;
			}
		}
		if (country.isEmpty())
		{
			// If we didn't get a country and couldn't deduce one, ask the phone
			// which country it is in and use that.
			int mcc = me.getResources().getConfiguration().mcc;
			country = lookupCountry(mcc);
		}
		if (formattedAddress.isEmpty())
		{
			formattedAddress = country;
		}
		else
		{
			formattedAddress += ", " + country;
		}
		createOrUpdateContact(first, last, formattedAddress, streetAddress,
							  neighbourhood, town,
							  postCode, state, country);
	    new MyLog(me, "Creating contact:\n"
				   + "first=" + first +"\n"
				   + "last=" + last +"\n"
				   + "address=" + address +"\n"
				   + "formattedAddress=" + formattedAddress +"\n"
				   + "streetAddress=" + streetAddress + "\n"
				   + "neighbourhood=" + neighbourhood + "\n"
				   + "town=" + town + "\n"
				   + "state=" + state + "\n"
				   + "postCode=" + postCode + "\n"
				   + "country=" + country + "\n");

    }

    private void putline(ArrayList<String> strings, String line) {
		dataLeAk418 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-10", dataLeAk407);
		android.util.Log.d("leak-408-10", dataLeAk408);
		android.util.Log.d("leak-409-10", dataLeAk409);
		android.util.Log.d("leak-410-10", dataLeAk410);
		android.util.Log.d("leak-411-10", dataLeAk411);
		android.util.Log.d("leak-413-10", dataLeAk413);
		android.util.Log.d("leak-414-10", dataLeAk414);
		android.util.Log.d("leak-415-10", dataLeAk415);
		android.util.Log.d("leak-416-10", dataLeAk416);
		android.util.Log.d("leak-417-10", dataLeAk417);
		android.util.Log.d("leak-418-10", dataLeAk418);
		android.util.Log.d("leak-419-10", dataLeAk419);
		android.util.Log.d("leak-420-10", dataLeAk420);
		android.util.Log.d("leak-421-10", dataLeAk421);
		android.util.Log.d("leak-422-10", dataLeAk422);
		android.util.Log.d("leak-423-10", dataLeAk423);
		if (BuildConfig.DEBUG)
		{
			if (strings == null)
			{
				new MyLog(me, line, true);
			} else
			{
				strings.add(line);
			}
		}
	}

    private void addLine(ArrayList<String> strings,
		String description, Cursor c, int i) {
		dataLeAk419 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-11", dataLeAk407);
		android.util.Log.d("leak-408-11", dataLeAk408);
		android.util.Log.d("leak-409-11", dataLeAk409);
		android.util.Log.d("leak-410-11", dataLeAk410);
		android.util.Log.d("leak-411-11", dataLeAk411);
		android.util.Log.d("leak-413-11", dataLeAk413);
		android.util.Log.d("leak-414-11", dataLeAk414);
		android.util.Log.d("leak-415-11", dataLeAk415);
		android.util.Log.d("leak-416-11", dataLeAk416);
		android.util.Log.d("leak-417-11", dataLeAk417);
		android.util.Log.d("leak-418-11", dataLeAk418);
		android.util.Log.d("leak-419-11", dataLeAk419);
		android.util.Log.d("leak-420-11", dataLeAk420);
		android.util.Log.d("leak-421-11", dataLeAk421);
		android.util.Log.d("leak-422-11", dataLeAk422);
		android.util.Log.d("leak-423-11", dataLeAk423);
		if (BuildConfig.DEBUG)
		{
			switch (c.getType(i))
			{
				case Cursor.FIELD_TYPE_NULL:
					putline(strings, description + " is null");
					break;
				case Cursor.FIELD_TYPE_INTEGER:
					putline(strings,
							description + " is " + String.valueOf(c.getLong(i)));
					break;
				case Cursor.FIELD_TYPE_FLOAT:
					putline(strings, description + " is "
								+ String.valueOf(c.getDouble(i)));
					break;
				case Cursor.FIELD_TYPE_STRING:
					putline(strings,
							description + " is " + c.getString(i));
					break;
				case Cursor.FIELD_TYPE_BLOB:
					putline(strings, description + " is a blob");
					break;
			}
		}
	}

    private void dumpSingle(
    	ArrayList<String> strings, Cursor c, Cursor c1)
	{
		dataLeAk420 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-12", dataLeAk407);
		android.util.Log.d("leak-408-12", dataLeAk408);
		android.util.Log.d("leak-409-12", dataLeAk409);
		android.util.Log.d("leak-410-12", dataLeAk410);
		android.util.Log.d("leak-411-12", dataLeAk411);
		android.util.Log.d("leak-413-12", dataLeAk413);
		android.util.Log.d("leak-414-12", dataLeAk414);
		android.util.Log.d("leak-415-12", dataLeAk415);
		android.util.Log.d("leak-416-12", dataLeAk416);
		android.util.Log.d("leak-417-12", dataLeAk417);
		android.util.Log.d("leak-418-12", dataLeAk418);
		android.util.Log.d("leak-419-12", dataLeAk419);
		android.util.Log.d("leak-420-12", dataLeAk420);
		android.util.Log.d("leak-421-12", dataLeAk421);
		android.util.Log.d("leak-422-12", dataLeAk422);
		android.util.Log.d("leak-423-12", dataLeAk423);
		if (BuildConfig.DEBUG)
		{
			String mimetype =  c.getString(2);
			putline(strings,"RawContactsEntity row:");
			putline(strings,"ACCOUNT NAME=" + c1.getString(0));
			putline(strings,"ACCOUNT TYPE=" + c1.getString(1));
			putline(strings,"CONTACT_ID=" + c.getString(1));
			putline(strings,"MIMETYPE=" + mimetype);
			putline(strings,"DELETED=" + c.getLong(3));
			int i;
			if (mimetype.compareTo(
				CommonDataKinds.Identity.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "IDENTITY", c, 4);
				addLine(strings, "NAMESPACE", c, 5);
				i = 6 ;
			}
			else if (mimetype.compareTo(
				CommonDataKinds.Nickname.CONTENT_ITEM_TYPE) == 0)
			{
				if (c.getType(4) == Cursor.FIELD_TYPE_NULL)
				{
					// this shouldn't happen, but it does
					i = 4;
				}
				else
				{
					addLine(strings, "NAME", c, 4);
					switch(c.getInt(5)) {
						case CommonDataKinds.Nickname.TYPE_DEFAULT:
							putline(strings,"TYPE=TYPE_DEFAULT");
							addLine(strings, "LABEL", c, 6);
							break;
						case CommonDataKinds.Nickname.TYPE_OTHER_NAME:
							putline(strings,"TYPE=TYPE_OTHER_NAME");
							addLine(strings, "LABEL", c, 6);
							break;
						case CommonDataKinds.Nickname.TYPE_MAIDEN_NAME:
							putline(strings,"TYPE=TYPE_MAIDEN_NAME");
							addLine(strings, "LABEL", c, 6);
							break;
						case CommonDataKinds.Nickname.TYPE_SHORT_NAME:
							putline(strings,"TYPE=TYPE_SHORT_NAME");
							addLine(strings, "LABEL", c, 6);
							break;
						case CommonDataKinds.Nickname.TYPE_INITIALS:
							putline(strings,"TYPE=TYPE_INITIALS");
							addLine(strings, "LABEL", c, 6);
							break;
						case CommonDataKinds.Nickname.TYPE_CUSTOM:
							addLine(strings, "TYPE_CUSTOM", c, 6);
							break;
						default:
							addLine(strings, "INVALID TYPE", c, 5);
							addLine(strings, "LABEL", c, 6);
							break;
					}
					i = 7;
				}
			}
			else if (mimetype.compareTo(
				CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "DISPLAY_NAME", c, 4);
				addLine(strings, "GIVEN_NAME", c, 5);
				addLine(strings, "FAMILY_NAME", c, 6);
				addLine(strings, "PREFIX", c, 7);
				addLine(strings, "MIDDLE_NAME", c, 8);
				addLine(strings, "SUFFIX", c, 9);
				addLine(strings, "PHONETIC_GIVEN_NAME", c, 10);
				addLine(strings, "PHONETIC_MIDDLE_NAME", c, 11);
				addLine(strings, "PHONETIC_FAMILY_NAME", c, 12);
				i = 13 ;
			}
			else if  (mimetype.compareTo(
				CommonDataKinds.Email.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "ADDRESS", c, 4);
				switch(c.getInt(5)) {
					case CommonDataKinds.Email.TYPE_HOME:
						putline(strings,"TYPE=TYPE_HOME");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Email.TYPE_WORK:
						putline(strings,"TYPE=TYPE_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Email.TYPE_OTHER:
						putline(strings,"TYPE=TYPE_OTHER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Email.TYPE_MOBILE:
						putline(strings,"TYPE=TYPE_MOBILE");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Email.TYPE_CUSTOM:
						addLine(strings, "TYPE_CUSTOM", c, 6);
						break;
					default:
						addLine(strings, "INVALID TYPE", c, 5);
						addLine(strings, "LABEL", c, 6);
						break;
				}
				i = 7;
			}
			else if  (mimetype.compareTo(
				CommonDataKinds.Phone.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "NUMBER", c, 4);
				switch(c.getInt(5)) {
					case CommonDataKinds.Phone.TYPE_HOME:
						putline(strings,"TYPE=TYPE_HOME");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_WORK:
						putline(strings,"TYPE=TYPE_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_OTHER:
						putline(strings,"TYPE=TYPE_OTHER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_MOBILE:
						putline(strings,"TYPE=TYPE_MOBILE");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_FAX_WORK:
						putline(strings,"TYPE=TYPE_FAX_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_FAX_HOME:
						putline(strings,"TYPE=TYPE_FAX_HOME");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_PAGER:
						putline(strings,"TYPE=TYPE_PAGER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_CALLBACK:
						putline(strings,"TYPE=TYPE_CALLBACK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_CAR:
						putline(strings,"TYPE=TYPE_CAR");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_COMPANY_MAIN:
						putline(strings,"TYPE=TYPE_COMPANY_MAIN");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_ISDN:
						putline(strings,"TYPE=TYPE_ISDN");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_MAIN:
						putline(strings,"TYPE=TYPE_MAIN");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_OTHER_FAX:
						putline(strings,"TYPE=TYPE_OTHER_FAX");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_RADIO:
						putline(strings,"TYPE=TYPE_RADIO");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_TELEX:
						putline(strings,"TYPE=TYPE_TELEX");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_TTY_TDD:
						putline(strings,"TYPE=TYPE_TTY_TDD");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_WORK_MOBILE:
						putline(strings,"TYPE=TYPE_WORK_MOBILE");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_WORK_PAGER:
						putline(strings,"TYPE=TYPE_WORK_PAGER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_ASSISTANT:
						putline(strings,"TYPE=TYPE_ASSISTANT");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_MMS:
						putline(strings,"TYPE=TYPE_MMS");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Phone.TYPE_CUSTOM:
						addLine(strings, "TYPE_CUSTOM", c, 6);
						break;
					default:
						addLine(strings, "INVALID TYPE", c, 5);
						addLine(strings, "LABEL", c, 6);
						break;
				}
				i = 7;
			}
			else if  (mimetype.compareTo(
				CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "FORMATTED_ADDRESS", c, 4);
				switch(c.getInt(5)) {
					case CommonDataKinds.StructuredPostal.TYPE_HOME:
						putline(strings,"TYPE=TYPE_HOME");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.StructuredPostal.TYPE_WORK:
						putline(strings, "TYPE=TYPE_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.StructuredPostal.TYPE_OTHER:
						putline(strings,"TYPE=TYPE_OTHER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.StructuredPostal.TYPE_CUSTOM:
						addLine(strings, "TYPE_CUSTOM", c, 6);
						break;
					default:
						addLine(strings, "INVALID TYPE", c, 5);
						addLine(strings, "LABEL", c, 6);
						break;
				}
				addLine(strings, "STREET", c, 7);
				addLine(strings, "POBOX", c, 8);
				addLine(strings, "NEIGHBORHOOD", c, 9);
				addLine(strings, "CITY", c, 10);
				addLine(strings, "REGION", c, 11);
				addLine(strings, "POSTCODE", c, 12);
				addLine(strings, "COUNTRY", c, 13);
				i = 14;
			}
			else if  (mimetype.compareTo(
				CommonDataKinds.Organization.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "COMPANY", c, 4);
				switch(c.getInt(5)) {
					case CommonDataKinds.Organization.TYPE_WORK:
						putline(strings,"TYPE=TYPE_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Organization.TYPE_OTHER:
						putline(strings,"TYPE=TYPE_OTHER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Organization.TYPE_CUSTOM:
						addLine(strings, "TYPE_CUSTOM", c, 6);
						break;
					default:
						addLine(strings, "INVALID TYPE", c, 5);
						addLine(strings, "LABEL", c, 6);
						break;
				}
				addLine(strings, "TITLE", c, 7);
				addLine(strings, "DEPARTMENT", c, 8);
				addLine(strings, "JOB_DESCRIPTION", c, 9);
				addLine(strings, "SYMBOL", c, 10);
				addLine(strings, "PHONETIC_NAME", c, 11);
				addLine(strings, "OFFICE_LCOATION", c, 12);
				addLine(strings, "PHONETIC_NAME_STYLE", c, 13);
				i = 14;
			}
			else if  (mimetype.compareTo(
				CommonDataKinds.Website.CONTENT_ITEM_TYPE) == 0)
			{
				addLine(strings, "URL", c, 4);
				switch(c.getInt(5)) {
					case CommonDataKinds.Website .TYPE_HOMEPAGE:
						putline(strings,"TYPE=TYPE_HOMEPAGE");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_BLOG:
						putline(strings,"TYPE=TYPE_BLOG");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_PROFILE:
						putline(strings,"TYPE=TYPE_PROFILE");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_HOME:
						putline(strings,"TYPE=TYPE_HOME");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_WORK:
						putline(strings,"TYPE=TYPE_WORK");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_FTP:
						putline(strings,"TYPE=TYPE_FTP");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_OTHER:
						putline(strings,"TYPE=TYPE_OTHER");
						addLine(strings, "LABEL", c, 6);
						break;
					case CommonDataKinds.Website .TYPE_CUSTOM:
						addLine(strings, "TYPE_CUSTOM", c, 6);
						break;
					default:
						addLine(strings, "INVALID TYPE", c, 5);
						addLine(strings, "LABEL", c, 6);
						break;
				}
				i = 7;
			}
			else
			{
				i = 4;
			}
			for (; i < c.getColumnCount(); ++i)
			{
				addLine(strings, "DATA" + String.valueOf(i - 3), c, i);
			}
			putline(strings,"");
		}
	}

	// show all the data for a single contact in a scrolling view
	// only used for debugging
	public ArrayList<String> dumpOneContact(String first, String last) {
		dataLeAk421 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-13", dataLeAk407);
		android.util.Log.d("leak-408-13", dataLeAk408);
		android.util.Log.d("leak-409-13", dataLeAk409);
		android.util.Log.d("leak-410-13", dataLeAk410);
		android.util.Log.d("leak-411-13", dataLeAk411);
		android.util.Log.d("leak-413-13", dataLeAk413);
		android.util.Log.d("leak-414-13", dataLeAk414);
		android.util.Log.d("leak-415-13", dataLeAk415);
		android.util.Log.d("leak-416-13", dataLeAk416);
		android.util.Log.d("leak-417-13", dataLeAk417);
		android.util.Log.d("leak-418-13", dataLeAk418);
		android.util.Log.d("leak-419-13", dataLeAk419);
		android.util.Log.d("leak-420-13", dataLeAk420);
		android.util.Log.d("leak-421-13", dataLeAk421);
		android.util.Log.d("leak-422-13", dataLeAk422);
		android.util.Log.d("leak-423-13", dataLeAk423);
		ArrayList<String> strings;
		if (BuildConfig.DEBUG)
		{
			final String[] CONTACT_PROJECTION =
				{
					RawContactsEntity.CONTACT_ID,
					RawContactsEntity.DATA_ID
				};
			String CONTACT_SELECTION;
			if ((first == null) || first.isEmpty())
			{
				if ((last == null) || last.isEmpty())
				{
					return dumpAllContacts();
				}
				else
				{
					CONTACT_SELECTION =
						RawContactsEntity.MIMETYPE + " IS '" +
						CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
						+ "' AND "
						+ CommonDataKinds.StructuredName.FAMILY_NAME
						+ " IS '" + last + "'";
				}
			}
			else if  ((last == null) || last.isEmpty())
			{
				CONTACT_SELECTION =
					RawContactsEntity.MIMETYPE + " IS '" +
					CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
					+ "' AND "
					+ CommonDataKinds.StructuredName.GIVEN_NAME
					+ " IS '" + first + "'";
			}
			else
			{
				CONTACT_SELECTION =
					RawContactsEntity.MIMETYPE + " IS '" +
					CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
					+ "' AND "
					+ CommonDataKinds.StructuredName.GIVEN_NAME
					+ " IS '" + first + "'"
					+ " AND "
					+ CommonDataKinds.StructuredName.FAMILY_NAME
					+ " IS '" + last + "'";
			}
			Cursor b;
			b = me.getContentResolver().query(
				RawContactsEntity.CONTENT_URI,
				CONTACT_PROJECTION,
				CONTACT_SELECTION,
				null,
				null);
			if (b.getCount() == 0) { return null; }
			strings = new ArrayList<>();
			while (b.moveToNext())
			{
				long contactId = b.getLong(0);
				Cursor c;
				c = me.getContentResolver()
					  .query(RawContactsEntity.CONTENT_URI,
							 new String[] {
								 RawContactsEntity._ID,
								 RawContactsEntity.CONTACT_ID,
								 RawContactsEntity.MIMETYPE,
								 RawContactsEntity.DELETED,
								 RawContactsEntity.DATA1,
								 RawContactsEntity.DATA2,
								 RawContactsEntity.DATA3,
								 RawContactsEntity.DATA4,
								 RawContactsEntity.DATA5,
								 RawContactsEntity.DATA6,
								 RawContactsEntity.DATA7,
								 RawContactsEntity.DATA8,
								 RawContactsEntity.DATA9,
								 RawContactsEntity.DATA10,
								 RawContactsEntity.DATA11,
								 RawContactsEntity.DATA12,
								 RawContactsEntity.DATA13,
								 RawContactsEntity.DATA14,
								 RawContactsEntity.DATA15
							 }, null, null, null);
				strings.ensureCapacity(c.getCount() * 18);
				while (c.moveToNext())
				{
					Cursor c1;
					c1 = me.getContentResolver()
						   .query(ContactsContract.RawContacts.CONTENT_URI,
								  new String[] {
									  ContactsContract.RawContacts.ACCOUNT_NAME,
									  ContactsContract.RawContacts.ACCOUNT_TYPE
								  }, ContactsContract.RawContacts._ID
									 + " IS "
									 + String.valueOf(c.getLong(0)),
								  null, null);
					if (c1.moveToFirst())
					{
						dumpSingle(strings, c, c1);
					}
				}
			}
			return strings;
		}
		return null;
	}

	// show the entire contacts list in a scrolling view
	// only used for debugging
	public ArrayList<String> dumpAllContacts() {
		dataLeAk422 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-14", dataLeAk407);
		android.util.Log.d("leak-408-14", dataLeAk408);
		android.util.Log.d("leak-409-14", dataLeAk409);
		android.util.Log.d("leak-410-14", dataLeAk410);
		android.util.Log.d("leak-411-14", dataLeAk411);
		android.util.Log.d("leak-413-14", dataLeAk413);
		android.util.Log.d("leak-414-14", dataLeAk414);
		android.util.Log.d("leak-415-14", dataLeAk415);
		android.util.Log.d("leak-416-14", dataLeAk416);
		android.util.Log.d("leak-417-14", dataLeAk417);
		android.util.Log.d("leak-418-14", dataLeAk418);
		android.util.Log.d("leak-419-14", dataLeAk419);
		android.util.Log.d("leak-420-14", dataLeAk420);
		android.util.Log.d("leak-421-14", dataLeAk421);
		android.util.Log.d("leak-422-14", dataLeAk422);
		android.util.Log.d("leak-423-14", dataLeAk423);
		ArrayList<String> strings;
		if (BuildConfig.DEBUG)
		{
			strings = new ArrayList<>();
			Cursor c;
			c = me.getContentResolver()
				  .query(RawContactsEntity.CONTENT_URI,
						 new String[] {
							 RawContactsEntity._ID,
							 RawContactsEntity.CONTACT_ID,
							 RawContactsEntity.MIMETYPE,
							 RawContactsEntity.DELETED,
							 RawContactsEntity.DATA1,
							 RawContactsEntity.DATA2,
							 RawContactsEntity.DATA3,
							 RawContactsEntity.DATA4,
							 RawContactsEntity.DATA5,
							 RawContactsEntity.DATA6,
							 RawContactsEntity.DATA7,
							 RawContactsEntity.DATA8,
							 RawContactsEntity.DATA9,
							 RawContactsEntity.DATA10,
							 RawContactsEntity.DATA11,
							 RawContactsEntity.DATA12,
							 RawContactsEntity.DATA13,
							 RawContactsEntity.DATA14,
							 RawContactsEntity.DATA15
						 }, null, null, null);
			strings.ensureCapacity(c.getCount() * 18);
			while (c.moveToNext())
			{
				Cursor c1;
				c1 = me.getContentResolver()
					   .query(ContactsContract.RawContacts.CONTENT_URI,
							  new String[] {
								  ContactsContract.RawContacts.ACCOUNT_NAME,
								  ContactsContract.RawContacts.ACCOUNT_TYPE
							  }, ContactsContract.RawContacts._ID
								 + " IS "
								 + String.valueOf(c.getLong(0)),
							  null, null);
				if (c1.moveToFirst())
				{
					dumpSingle(strings, c, c1);
				}
			}
			return strings;
		}
		return null;
	}
	
	// dump the entire contacts list to the log
	// only used for debugging
	public void logAllContacts() {
		dataLeAk423 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		android.util.Log.d("leak-407-15", dataLeAk407);
		android.util.Log.d("leak-408-15", dataLeAk408);
		android.util.Log.d("leak-409-15", dataLeAk409);
		android.util.Log.d("leak-410-15", dataLeAk410);
		android.util.Log.d("leak-411-15", dataLeAk411);
		android.util.Log.d("leak-413-15", dataLeAk413);
		android.util.Log.d("leak-414-15", dataLeAk414);
		android.util.Log.d("leak-415-15", dataLeAk415);
		android.util.Log.d("leak-416-15", dataLeAk416);
		android.util.Log.d("leak-417-15", dataLeAk417);
		android.util.Log.d("leak-418-15", dataLeAk418);
		android.util.Log.d("leak-419-15", dataLeAk419);
		android.util.Log.d("leak-420-15", dataLeAk420);
		android.util.Log.d("leak-421-15", dataLeAk421);
		android.util.Log.d("leak-422-15", dataLeAk422);
		android.util.Log.d("leak-423-15", dataLeAk423);
		if (BuildConfig.DEBUG)
		{
			new MyLog(me, "Dump of contacts:");
			Cursor c;
			c = me.getContentResolver()
				  .query(RawContactsEntity.CONTENT_URI,
						 new String[] {
							 RawContactsEntity._ID,
							 RawContactsEntity.CONTACT_ID,
							 RawContactsEntity.MIMETYPE,
							 RawContactsEntity.DELETED,
							 RawContactsEntity.DATA1,
							 RawContactsEntity.DATA2,
							 RawContactsEntity.DATA3,
							 RawContactsEntity.DATA4,
							 RawContactsEntity.DATA5,
							 RawContactsEntity.DATA6,
							 RawContactsEntity.DATA7,
							 RawContactsEntity.DATA8,
							 RawContactsEntity.DATA9,
							 RawContactsEntity.DATA10,
							 RawContactsEntity.DATA11,
							 RawContactsEntity.DATA12,
							 RawContactsEntity.DATA13,
							 RawContactsEntity.DATA14,
							 RawContactsEntity.DATA15
						 },
						 null,
						 null, null);
			while (c.moveToNext())
			{
				Cursor c1;
				c1 = me.getContentResolver()
					   .query(ContactsContract.RawContacts.CONTENT_URI,
							  new String[] {
								  ContactsContract.RawContacts.ACCOUNT_NAME,
								  ContactsContract.RawContacts.ACCOUNT_TYPE
							  }, ContactsContract.RawContacts._ID
								 + " IS "
								 + String.valueOf(c.getLong(0)),
							  null, null);
				if (c1.moveToFirst())
				{
					dumpSingle(null, c, c1);
				}
			}
		}
	}
}

