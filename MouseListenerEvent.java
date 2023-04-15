
public class MouseListenerEvent extends javax.swing.JFrame implements java.awt.event.MouseMotionListener{
    private javax.swing.JTextField XAxisTextField;
    private javax.swing.JTextField YAxisTextField;
    private javax.swing.JLabel XAxisJLabel;
    private javax.swing.JLabel YAxisJLabel;
    private javax.swing.JPanel XJPanel;
    private javax.swing.JPanel YJPanel;

    public MouseListenerEvent(){
        initComponent();
    }

    public void initComponent(){
      /* ***********************JFrame Design**********************************  */
        //this.setBounds(100,150,350,150);
        this.setSize(getMaximumSize());
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setTitle("Mouse Cursor Coordinates");
        this.setLayout(new java.awt.BorderLayout());
        this.addMouseMotionListener(this);
      /* **********************XAxisJLabel && YAxisJLabel Design*********************************** */
        XJPanel = new javax.swing.JPanel(new java.awt.GridLayout(1,2,5,5));
        XAxisJLabel = new javax.swing.JLabel("X-Click" );
        XJPanel.add(XAxisJLabel);
        XAxisTextField = new javax.swing.JTextField();
        XJPanel.add(XAxisTextField);

        YJPanel = new javax.swing.JPanel(new java.awt.GridLayout(1,2,5,5));
        YAxisJLabel = new javax.swing.JLabel("Y-Click");
        YJPanel.add(YAxisJLabel);
        YAxisTextField = new javax.swing.JTextField();
        YAxisTextField.setEditable(false);
        YJPanel.add(YAxisTextField);

        this.add(XJPanel,java.awt.BorderLayout.PAGE_START);this.add(YJPanel,java.awt.BorderLayout.PAGE_END);
        this.setVisible(true);
    }

    public void mouseDragged(java.awt.event.MouseEvent evt){
      
    }

    public void mouseMoved(java.awt.event.MouseEvent evt){
      XAxisTextField.setText(Integer.toString(evt.getYOnScreen()));
      YAxisTextField.setText(Integer.toString(evt.getYOnScreen()));
    }

   public static void main(String agrs[]){
        new MouseListenerEvent();
   }
}