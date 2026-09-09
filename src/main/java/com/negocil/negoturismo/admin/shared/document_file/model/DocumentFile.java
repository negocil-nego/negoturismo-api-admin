package com.negocil.negoturismo.admin.shared.document_file.model;

import com.negocil.negoturismo.admin.shared.document_file.enums.FileType;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.DOCUMENT_FILE)
public class DocumentFile extends ConcreteModel {
    @NotBlank
    @Size(max = 2000)
    private String url;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FileType fileType;

    @Size(max = 2000)
    private String thumbnail;

    @NotBlank
    @Size(max = 255)
    private String title;

    @Size(max = 1000)
    @Column(length = 1000)
    private String description;

    private String concat;
}
