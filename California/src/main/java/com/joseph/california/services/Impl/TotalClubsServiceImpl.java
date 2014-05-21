/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.services.Impl;

import com.joseph.california.domain.Club;
import com.joseph.california.respository.ClubRepository;
import com.joseph.california.services.TotalClubsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bradley
 */
@Service
public class TotalClubsServiceImpl implements TotalClubsService {
   
    @Autowired
    private ClubRepository clubRepository;
    
    @Override
    public List<Club> getTotalClubs() {
        return clubRepository.findAll();
    }
    
}