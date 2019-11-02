package com.nationwide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ESRrepo extends JpaRepository<ESR,Integer> {

}
