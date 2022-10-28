import javax.swing.*;

public class Window extends JFrame {
    private JTextArea inputText;
    private String[] options = { "Alta", "Média", "Baixa" };
    private JComboBox<String> optionsSelect;

    public Window() {
        windowConfig();
        setVisible(true);
        setSize(650, 360);
        setTitle("Cadastro de Tarefas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void windowConfig() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Etiqueta do campo 1
        JLabel firstLabel = new JLabel("Tarefa");
        firstLabel.setBounds(60, 10, 100, 10);
        firstLabel.setOpaque(true);

        // Campo de texto
        inputText = new JTextArea(45, 100);
        inputText.setBounds(60, 30, 500, 80);
        inputText.setBorder(BorderFactory.createLineBorder(getForeground()));

        // Etiqueta do campo 2
        JLabel secondLabel = new JLabel("Prioridade");
        secondLabel.setBounds(60, 150, 100, 10);
        secondLabel.setOpaque(true);

        // Seletor
        optionsSelect = new JComboBox<>(options);
        optionsSelect.setBounds(60, 170, 500, 30);

        // Checkbox
        JCheckBox checkbox = new JCheckBox("Finalizado");
        checkbox.setBounds(60, 220, 100, 30);

        // Botão de Salvar
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(370, 270, 90, 30);

        // Botão de Cancelar
        JButton saveButton = new JButton("Salvar");
        saveButton.setBounds(480, 270, 80, 30);

        panel.add(firstLabel);
        panel.add(inputText);

        panel.add(secondLabel);
        panel.add(optionsSelect);

        panel.add(checkbox);

        panel.add(cancelButton);
        panel.add(saveButton);
        
        add(panel);
    }

}
