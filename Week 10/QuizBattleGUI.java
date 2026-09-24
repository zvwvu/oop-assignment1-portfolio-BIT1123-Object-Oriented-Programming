import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    private Questions question;

    private JLabel questionLabel;
    private JButton option1Button;
    private JButton option2Button;
    private JLabel resultLabel;

    public QuizBattleGUI() {

        question = new Questions(
                "Which keyword creates an object?",
                "new",
                "class",
                "new"
        );

        setTitle("Programming Quiz Battle");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        questionLabel = new JLabel(question.getQuestion());

        option1Button = new JButton(question.getOption1());
        option2Button = new JButton(question.getOption2());

        resultLabel = new JLabel("Answer the question!");

        option1Button.addActionListener(this);
        option2Button.addActionListener(this);

        add(questionLabel);
        add(option1Button);
        add(option2Button);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();

        String choice = clickedButton.getText();

        if (question.isCorrect(choice)) {
            resultLabel.setText("Correct! You defeated the Code Boss!");
        } else {
            resultLabel.setText("Wrong! Try Again!");
        }

    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}