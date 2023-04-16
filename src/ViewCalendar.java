import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ViewCalendar extends JFrame
{
    private ModelCalendar model;
    public ViewCalendar(ModelCalendar m)
    {
        model = m;

        setSize(1200, 1000);
        CalendarMaker c = new CalendarMaker();
        add(c, BorderLayout.CENTER);


        JPanel testS = new JPanel();
        JTextArea text = new JTextArea(m.getToday().toString());
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        testS.add(text);
        add(testS, BorderLayout.NORTH);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);




    }

    public class CalendarMaker extends JPanel
    {
        public CalendarMaker()
        {
            setLayout(new GridLayout(6, 7));

            for (int i = 0; i < 42; i++)
            {
                add(new Days());
            }

        }


    }

    public class Days extends JComponent
    {

        @Override
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D.Double daySquare = new Rectangle2D.Double(0, 0, 200, 200);
            g2.draw(daySquare);
        }

    }



}