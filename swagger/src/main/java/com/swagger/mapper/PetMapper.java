package com.swagger.mapper;

import com.swagger.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(Integer p_id);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer p_id);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);

    List<Pet> selectPet();

    List<Pet> selectAllShop();

    List<Pet> selectAllDepot();

    int updatePetToShop(int p_id);

    Pet selectPetById(int p_id);



}