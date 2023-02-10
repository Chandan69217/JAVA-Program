package temperatureconverter;

public class MainClass{
    public static void main(String agrs[]){
        TemperatureConverterDesign Design = new TemperatureConverterDesign();
        Design.setVisible(true);
        java.util.Timer timer = new java.util.Timer();
        java.util.TimerTask task = new java.util.TimerTask(){
            @Override
            public void run(){
                switch (Design.DegreeInput.getSelectedIndex()) {
                    case 1 -> {
                         Design.DegreeOutput.removeAllItems();
                         Design.DegreeOutput.addItem(Design.DegreeName[2]);
                    }
                    case 2 -> {
                         Design.DegreeOutput.removeAllItems();
                         Design.DegreeOutput.addItem(Design.DegreeName[1]);
                    }
                    default -> Design.DegreeOutput.removeAllItems();
                }
          }
        };
        timer.schedule(task,100,10);  
    }
}