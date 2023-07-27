package com.ict.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ict.entity.StdDtlBO;

@Repository
public interface std_Repo extends JpaRepository<StdDtlBO, Integer>{

}
