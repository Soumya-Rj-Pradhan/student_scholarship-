package com.ict.std;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface std_Repo extends JpaRepository<StdDtlBO, Integer>{

}
