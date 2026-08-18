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
    );

    private final InterpreterLanguage interpreterLanguage;
}
