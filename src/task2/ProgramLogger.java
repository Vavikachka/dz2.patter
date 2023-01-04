package task2;

    public class ProgramLogger {
        private static ProgramLogger programLogger;
        //записать действие программы
        private static String logFile = "This is log file. \n ";
        //    возращает экземпляр ProgramLogger
        public static synchronized   ProgramLogger getProgramLogger(){
            if(programLogger == null){
                programLogger = new ProgramLogger();
            }
            return programLogger;
        }

        //    Конструктор
        private ProgramLogger(){}

        //    занести информация logFile
        public void addLogInfo(String logInfo){
            logFile += logInfo + "\n";
        }

        //    отобразить logFile
        public void showLogFile(){
            System.out.println(logFile);
        }
    }


