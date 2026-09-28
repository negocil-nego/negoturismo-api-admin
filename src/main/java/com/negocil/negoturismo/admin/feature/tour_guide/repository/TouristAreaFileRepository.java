package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristAreaFile;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TouristAreaFileRepository extends JpaRepository<TouristAreaFile, Long>, JpaSpecificationExecutor<TouristAreaFile> {
    Optional<TouristAreaFile> findByTouristAreaAndDoc(TouristArea touristArea, DocumentFile doc);

    List<TouristAreaFile> findByTouristArea(TouristArea touristArea);
}
