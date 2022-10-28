import javax.swing.*;

public class Window extends JFrame {
    private JTextArea inputText;
    private String[] options = {"Alta","Média","Baixa"};
    private JComboBox<String> optionsSelect;

    public Window(){
        windowConfig();
        setVisible(true);
        setSize(750, 600);
        setTitle("Cadastro de Tarefas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void windowConfig() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Campo de texto
        inputText = new JTextArea(45, 100);
        inputText.setBounds(60, 45, 700, 80);
        inputText.setBorder(BorderFactory.createLineBorder(getForeground()));

        // Etiqueta do campo 1
        JLabel firstLabel = new JLabel("Tarefa");
        firstLabel.setBounds(60, 10, 100, 30);
        firstLabel.setOpaque(true);

        // Etiqueta do campo 2
        JLabel secondLabel = new JLabel("Prioridade");
        secondLabel.setBounds(60, 200, 100, 60);
        secondLabel.setOpaque(true);

        // Seletor
        optionsSelect = new JComboBox<>(options);
        optionsSelect.setBounds(60, 260, 700, 30);

        //Botão de salvar
        JButton saveButton = new JButton("Salvar");
        saveButton.setBounds(650, 370, 80, 30);

        //Botão de cancelar
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(550, 370, 80, 30);

        panel.add(firstLabel);

        panel.add(secondLabel);

        panel.add(saveButton);

        panel.add(cancelButton);

        panel.add(optionsSelect);

        panel.add(inputText);
        
        add(panel);
    }

}
