package temperatureconverter;

public class TemperatureConverterDesign extends javax.swing.JFrame implements java.awt.event.ActionListener,java.awt.event.KeyListener{
  public  TemperatureConverterDesign(){
       initComponent();
   }
  /* ***********************************veriables************************************** */
    public  javax.swing.JComboBox DegreeInput;
    public  javax.swing.JTextField DegreeInputTextField;
    public  javax.swing.JComboBox DegreeOutput;
    public  javax.swing.JTextField DegreeOutputTextField;
    public  javax.swing.JButton ClearButton;
    public javax.swing.JButton ConverterButton;
    public final String DegreeName[] = new String[]{"Choose Degree","Celsius","Fahrenheit"};
    public double result;
    
    
    
    private void initComponent(){
                   //Frame Design
    this.setTitle("Temperature Converter");
    this.setBounds(150,100,350,130);
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("D:\\Programs\\NetBeansProjects\\Temperature Converter\\src\\temperatureconverter\\icons.png"));
    this.setLayout(new java.awt.GridLayout(3,2,10,10));
    
    DegreeInput = new javax.swing.JComboBox();
    DegreeInput.addItem(DegreeName[0]);
    DegreeInput.addItem(DegreeName[1]);
    DegreeInput.addItem(DegreeName[2]);
    DegreeInput.addActionListener(this);
    DegreeInput.addKeyListener(this);
    DegreeInput.requestFocus();
    this.add(DegreeInput);
    
    DegreeInputTextField = new javax.swing.JTextField();
    DegreeInputTextField.addKeyListener(this);
    this.add(DegreeInputTextField);
    
    DegreeOutput = new javax.swing.JComboBox();
    this.add(DegreeOutput);
    
    DegreeOutputTextField = new javax.swing.JTextField();
    DegreeOutputTextField.setEditable(false);
    this.add(DegreeOutputTextField);
    
    ClearButton = new javax.swing.JButton();
    ClearButton.setText("Clear");
    ClearButton.addActionListener(this);
    this.add(ClearButton);
    
    ConverterButton = new javax.swing.JButton();
    ConverterButton.setText("Convert");
    ConverterButton.addActionListener(this);
    ConverterButton.addKeyListener(this);
    this.add(ConverterButton);
    
   }
 
  @Override
    public void actionPerformed(java.awt.event.ActionEvent evt){
        if(evt.getSource()==ClearButton){
            clear();
        }
        else if(evt.getSource()==ConverterButton&&DegreeInputTextField.getText().length()!=0){
            int value = Integer.parseInt(DegreeInputTextField.getText());
            DegreeOutputTextField.setText(Double.toString(degreeConverter(value)));
        }
    }
    @Override
    public void keyReleased(java.awt.event.KeyEvent evt){
        
    }

    /**
     *
     * @param evt
     */
    @Override
    public void keyPressed(java.awt.event.KeyEvent evt){
       // javax.swing.JOptionPane.showMessageDialog(this,Integer.toString(evt.getKeyCode()));
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER&&DegreeInputTextField.getText().length()!=0){
           ConverterButton.requestFocus();
           int value = Integer.parseInt(DegreeInputTextField.getText());
           DegreeOutputTextField.setText(Double.toString(degreeConverter(value)));
        }
  
    }
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt){
        
    }
    
    public  double degreeConverter(int Degree){
        if(DegreeInput.getSelectedIndex()==0){
            javax.swing.JOptionPane.showMessageDialog(this, "Please Select Degree");
            return 0;
        }
        if(DegreeInput.getSelectedIndex()==1){
            result=Degree*(double)(9.0/5.0)+32;
        }
        else{
             result=(Degree-32)*(double)5.0/9.0;
        }
        return result;
    }
    
    public void clear(){
        DegreeInput.showPopup();
        DegreeInputTextField.setText("");
        DegreeOutputTextField.setText("");
        DegreeOutput.removeAllItems(); 
    }
}
