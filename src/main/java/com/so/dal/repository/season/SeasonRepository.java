/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dal.repository.season;

import com.so.dal.model.season.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;


@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer>{
    public List<Season> findByNameContaining(String name);
    public Season findByName(String name);
}
