/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.services.Impl;

import com.joseph.california.domain.Owner;
import com.joseph.california.respository.OwnerRepository;
import com.joseph.california.services.TotalOwnersService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bradley
 */
@Service
public class TotalOwnersServiceImpl implements TotalOwnersService {

    @Autowired
    private OwnerRepository ownerRepository;
    
    @Override
    public List<Owner> getTotalOwners() {
       // List<Owner> owners = new ArrayList<>();
        return ownerRepository.findAll();
        //for (Owner owner : allOwners) {
        //    if (owner.getId() != 0) {
         //       owners.add(owner);
          //  }
       // }
        //return owners;
    }
}

