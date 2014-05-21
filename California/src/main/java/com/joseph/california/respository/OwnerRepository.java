/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.respository;

import com.joseph.california.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Bradley
 */
@Repository //important annotation
public interface OwnerRepository extends JpaRepository<Owner, Long>{
    
}
