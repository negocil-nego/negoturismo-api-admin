package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.interpreter.enums.CountryLanguage;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterLanguageData {
    ANA_ENGLISH(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.ANA_SILVA_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.ENGLISH)
                    .build()
    ),
    CARLOS_FRENCH(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.CARLOS_NDALU_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.FRENCH)
                    .build()
    ),

    NEUSA_KALUNGA_PORTUGUESE(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.NEUSA_KALUNGA_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.PORTUGUESE)
                    .build()
    ),

    LISANDRO_KAMBALE_SPANISH(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.LISANDRO_KAMBALE_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.SPANISH)
                    .build()
    ),

    IVONE_BENGUELA_GERMAN(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.IVONE_BENGUELA_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.GERMAN)
                    .build()
    ),

    ILIDIO_MINGAS_ITALIAN(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.ILIDIO_MINGAS_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.ITALIAN)
                    .build()
    ),

    CELESTINE_KIALA_RUSSIAN(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.CELESTINE_KIALA_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.RUSSIAN)
                    .build()
    ),

    SEBASTIAO_NETO_CABRAL_CHINESE(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.SEBASTIAO_NETO_CABRAL_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.CHINESE)
                    .build()
    ),

    EDUARDA_MINGAS_ARABIC(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.EDUARDA_MINGAS_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.ARABIC)
                    .build()
    ),

    NUNO_KIALA_MINGAS_HINDI(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.NUNO_KIALA_MINGAS_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.HINDI)
                    .build()
    ),

    FILOMENA_NETO_LINGALA(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.FILOMENA_NETO_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.LINGALA)
                    .build()
    ),

    QUINTINO_KAMBUE_NETO_KINYARWANDA(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.QUINTINO_KAMBUE_NETO_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.KINYARWANDA)
                    .build()
    ),

    GRACA_KAMBUE_TETUM(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.GRACA_KAMBUE_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.TETUM)
                    .build()
    ),

    ULISSES_BENGUELA_SWAHILI(
            InterpreterLanguage.builder()
                    .interpreter(InterpreterData.ULISSES_BENGUELA_INTERPRETER.getInterpreter())
                    .language(CountryLanguage.SWAHILI)
                    .build()
    );

    private final InterpreterLanguage interpreterLanguage;
}
