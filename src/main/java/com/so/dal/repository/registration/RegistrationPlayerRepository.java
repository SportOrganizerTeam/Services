/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dal.repository.registration;

import com.so.dal.model.registration.RegistrationPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author peter
 */
@Repository
public interface RegistrationPlayerRepository extends JpaRepository<RegistrationPlayer, Integer>{
    
}
