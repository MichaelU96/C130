package com.c130.m3.dvdLibrary.Dao;

import java.util.List;

import com.c130.m3.dvdLibrary.dto.DVD;


public interface DVDLibDao {

        DVD addDVD(String titleDVD, DVD DVD)throws DVDLibraryDaoException;


        List<DVD> getAllDVDs()throws DVDLibraryDaoException;


        DVD getDVD(String titleDVD)throws DVDLibraryDaoException;


        DVD removeDVD(String titleDVD) throws DVDLibraryDaoException;

        DVD editDVD(String titleDVD) throws DVDLibraryDaoException;

        public void writeToDVD() throws DVDLibraryDaoException;
    }


