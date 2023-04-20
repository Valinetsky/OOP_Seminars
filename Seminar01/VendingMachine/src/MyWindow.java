import javax.swing.*;


/**
 * Наследник класса JFrame - новый класс для генерации окна и вывода
 */
public class MyWindow extends JFrame{    
 
    /**
     * конструктор окна
     * @param probe - строковая переменная для вывода в окне
     */
    MyWindow(String probe){
        super(probe);

        JTextArea label = new JTextArea(probe);
        getContentPane().add(label);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}