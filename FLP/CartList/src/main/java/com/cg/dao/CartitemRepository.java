package com.cg.dao;

import java.util.List;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Cartitem;

@Repository
public interface CartitemRepository extends JpaRepository<Cartitem, Integer>{

	

}
