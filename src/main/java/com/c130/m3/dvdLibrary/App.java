package com.c130.m3.dvdLibrary;

import com.c130.m3.dvdLibrary.Dao.DVDLibDao;

public class App {
        public static void main(String[] args) {
            UserIO io = new UserIOImpl();
            DVDLibView view = new DVDLibView(io);
            DVDLibDao dao = new DVDDaoFileImpl();
            DVDLibController controller = new DVDLibController(view, dao);
            controller.run();
        }
}
