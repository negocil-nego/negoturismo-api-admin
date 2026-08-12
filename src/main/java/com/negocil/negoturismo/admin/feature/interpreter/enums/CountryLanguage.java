package com.negocil.negoturismo.admin.feature.interpreter.enums;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Official languages of the world (ISO 639-1 code where one exists,
 * otherwise ISO 639-3). Covers languages that are official at the
 * national level in at least one country, plus a handful of major
 * co-official/regional languages commonly requested by interpreters.
 */
@Getter
@RequiredArgsConstructor
@Schema(description = "Official language spoken by an interpreter")
public enum CountryLanguage {
    AFRIKAANS("af", "Afrikaans"),
    ALBANIAN("sq", "Albanian"),
    AMHARIC("am", "Amharic"),
    ARABIC("ar", "Arabic"),
    ARMENIAN("hy", "Armenian"),
    AZERBAIJANI("az", "Azerbaijani"),
    BAMBARA("bm", "Bambara"),
    BENGALI("bn", "Bengali"),
    BISLAMA("bi", "Bislama"),
    BOSNIAN("bs", "Bosnian"),
    BULGARIAN("bg", "Bulgarian"),
    BURMESE("my", "Burmese"),
    CATALAN("ca", "Catalan"),
    CHICHEWA("ny", "Chichewa"),
    CHINESE("zh", "Chinese (Mandarin)"),
    CROATIAN("hr", "Croatian"),
    CZECH("cs", "Czech"),
    DANISH("da", "Danish"),
    DARI("prs", "Dari"),
    DIVEHI("dv", "Divehi"),
    DUTCH("nl", "Dutch"),
    DZONGKHA("dz", "Dzongkha"),
    ENGLISH("en", "English"),
    ESTONIAN("et", "Estonian"),
    FAROESE("fo", "Faroese"),
    FIJIAN("fj", "Fijian"),
    FILIPINO("fil", "Filipino"),
    FINNISH("fi", "Finnish"),
    FRENCH("fr", "French"),
    GEORGIAN("ka", "Georgian"),
    GERMAN("de", "German"),
    GREEK("el", "Greek"),
    GUARANI("gn", "Guarani"),
    HAITIAN_CREOLE("ht", "Haitian Creole"),
    HAUSA("ha", "Hausa"),
    HEBREW("he", "Hebrew"),
    HINDI("hi", "Hindi"),
    HUNGARIAN("hu", "Hungarian"),
    ICELANDIC("is", "Icelandic"),
    INDONESIAN("id", "Indonesian"),
    IRISH("ga", "Irish"),
    ITALIAN("it", "Italian"),
    JAPANESE("ja", "Japanese"),
    KAZAKH("kk", "Kazakh"),
    KHMER("km", "Khmer"),
    KINYARWANDA("rw", "Kinyarwanda"),
    KIRUNDI("rn", "Kirundi"),
    KOREAN("ko", "Korean"),
    KURDISH("ku", "Kurdish"),
    KYRGYZ("ky", "Kyrgyz"),
    LAO("lo", "Lao"),
    LATVIAN("lv", "Latvian"),
    LINGALA("ln", "Lingala"),
    LITHUANIAN("lt", "Lithuanian"),
    LUXEMBOURGISH("lb", "Luxembourgish"),
    MACEDONIAN("mk", "Macedonian"),
    MALAGASY("mg", "Malagasy"),
    MALAY("ms", "Malay"),
    MALTESE("mt", "Maltese"),
    MONGOLIAN("mn", "Mongolian"),
    MONTENEGRIN("cnr", "Montenegrin"),
    NEPALI("ne", "Nepali"),
    NORWEGIAN("no", "Norwegian"),
    OROMO("om", "Oromo"),
    PASHTO("ps", "Pashto"),
    PERSIAN("fa", "Persian"),
    POLISH("pl", "Polish"),
    PORTUGUESE("pt", "Portuguese"),
    PUNJABI("pa", "Punjabi"),
    ROMANIAN("ro", "Romanian"),
    RUSSIAN("ru", "Russian"),
    SAMOAN("sm", "Samoan"),
    SANGO("sg", "Sango"),
    SERBIAN("sr", "Serbian"),
    SESOTHO("st", "Sesotho"),
    SETSWANA("tn", "Setswana"),
    SHONA("sn", "Shona"),
    SINHALA("si", "Sinhala"),
    SLOVAK("sk", "Slovak"),
    SLOVENIAN("sl", "Slovenian"),
    SOMALI("so", "Somali"),
    SPANISH("es", "Spanish"),
    SWAHILI("sw", "Swahili"),
    SWATI("ss", "Swati"),
    SWEDISH("sv", "Swedish"),
    TAJIK("tg", "Tajik"),
    TAMIL("ta", "Tamil"),
    TETUM("tet", "Tetum"),
    THAI("th", "Thai"),
    TIGRINYA("ti", "Tigrinya"),
    TONGAN("to", "Tongan"),
    TURKISH("tr", "Turkish"),
    TURKMEN("tk", "Turkmen"),
    UKRAINIAN("uk", "Ukrainian"),
    URDU("ur", "Urdu"),
    UZBEK("uz", "Uzbek"),
    VIETNAMESE("vi", "Vietnamese"),
    WELSH("cy", "Welsh"),
    WOLOF("wo", "Wolof"),
    XHOSA("xh", "Xhosa"),
    ZULU("zu", "Zulu");

    private final String code;
    private final String displayName;

    public static CountryLanguage fromCode(String code) {
        for (CountryLanguage countryLanguage : values()) {
            if (countryLanguage.code.equalsIgnoreCase(code)) {
                return countryLanguage;
            }
        }
        throw new IllegalArgumentException("Unknown language code: " + code);
    }
}