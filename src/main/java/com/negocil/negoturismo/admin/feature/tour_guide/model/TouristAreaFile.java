package com.negocil.negoturismo.admin.feature.tour_guide.model;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Table(name = ConcreteTableModel.TOURIST_AREA_FILE)
public class TouristAreaFile extends CommonModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_file_id", nullable = false)
    @NotNull
    private DocumentFile doc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tourist_area_id", nullable = false)
    @NotNull
    private TouristArea touristArea;
}
