package com.company.Book;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Show_bookings extends JFrame
{

    private JPanel contentPane;
    private final JTable table = new JTable();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Show_bookings frame = new Show_bookings();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Show_bookings()
    {
        setBounds(450, 319, 1014, 460);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        String col[]={"Name","Username","Address","Book name","Price","Conition"};
        String col1[][] = null;
        DefaultTableModel md=new DefaultTableModel();
        md.setColumnIdentifiers(col);

        JTable jt=new JTable(col1,col);
        jt.setBounds(1, 1, 1008, 425);
        jt.setModel(md);
        contentPane.add(jt);
        //jt.addColumnSelectionInterval(col);
    }
}