package com.khwan.domain.repository;

import com.khwan.domain.model.entity.Code;
import com.khwan.domain.repository.Impl.MainRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepository extends JpaRepository<Code,String>, MainRepositoryCustom {
}
