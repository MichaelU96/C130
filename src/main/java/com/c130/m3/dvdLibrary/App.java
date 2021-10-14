package com.c130.m3.dvdLibrary;

import com.c130.m3.dvdLibrary.Dao.DVDLibDao;
import com.c130.m3.dvdLibrary.Dao.DVDLibraryDaoFilemp;
import com.c130.m3.dvdLibrary.UI.DVDLibraryView;
import com.c130.m3.dvdLibrary.UI.UserIO;
import com.c130.m3.dvdLibrary.controller.DVDLibraryController;

public class App {
        public static void main(String[] args) {
            UserIO io = new UserIO() {
                @Override
                public void print(String msg) {

                }

                @Override
                public double readDouble(String prompt) {
                    return 0;
                }

                @Override
                public double readDouble(String prompt, double min, double max) {
                    return 0;
                }

                @Override
                public float readFloat(String prompt) {
                    return 0;
                }

                @Override
                public float readFloat(String prompt, float min, float max) {
                    return 0;
                }

                @Override
                public int readInt(String prompt) {
                    return 0;
                }

                @Override
                public int readInt(String prompt, int min, int max) {
                    return 0;
                }

                @Override
                public long readLong(String prompt) {
                    return 0;
                }

                @Override
                public long readLong(String prompt, long min, long max) {
                    return 0;
                }

                @Override
                public String readString(String prompt) {
                    return null;
                }
            };
            DVDLibraryView view = new DVDLibraryView(io);
            DVDLibDao dao = new DVDLibraryDaoFilemp();
            DVDLibraryController controller = new DVDLibraryController(view, dao);
            controller.run();
        }
}
