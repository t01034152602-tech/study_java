import javax.swing.*;
import java.awt.*;

public class MemoApp extends JFrame {

    private final JTextField inputField = new JTextField();
    private final JTextArea memoArea = new JTextArea();
    private final JButton confirmButton = new JButton("확인");

    public MemoApp() {
        setTitle("메모 앱");
        setBounds(300, 500, 300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        JPanel topPanel = new JPanel(new BorderLayout(8, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 8));
        topPanel.add(inputField, BorderLayout.CENTER);
        topPanel.add(confirmButton, BorderLayout.EAST);

        memoArea.setEditable(false);
        memoArea.setLineWrap(true);
        memoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(memoArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        confirmButton.addActionListener(e -> appendMemo());
        inputField.addActionListener(e -> appendMemo());
    }

    private void appendMemo() {
        String text = inputField.getText().trim();
        if (text.isEmpty()) {
            return;
        }
        if (!memoArea.getText().isEmpty()) {
            memoArea.append("\n");
        }
        memoArea.append(text);
        inputField.setText("");
        inputField.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MemoApp app = new MemoApp();
            app.setVisible(true);
        });
    }
}
