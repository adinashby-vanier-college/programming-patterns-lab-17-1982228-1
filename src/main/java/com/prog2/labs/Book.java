/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author bridj
 */
public class Book {

    private String title;
    private String author;
    private String year;
    private String id;

    public Book(String title, String author, String year, String id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*Book Table

        /*
        import javax.swing.*;
        import javax.swing.table.DefaultTableModel;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

        public class ExampleView extends JFrame {
        private DefaultTableModel tableModel;
        private JTable table;
        private JTextField searchField;

        public ExampleView() {
            setTitle("Table Search Example");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Create sample data for the table
            List<String[]> dataList = new ArrayList<>();
            dataList.add(new String[]{"John Doe", "30", "New York"});
            dataList.add(new String[]{"Alice Smith", "25", "Los Angeles"});
            dataList.add(new String[]{"Bob Johnson", "35", "Chicago"});

            // Create table model and table
            String[] columnNames = {"Name", "Age", "City"};
            tableModel = new DefaultTableModel(columnNames, 0);
            for (String[] data : dataList) {
                tableModel.addRow(data);
            }
            table = new JTable(tableModel);

            // Create search panel
            JPanel searchPanel = new JPanel();
            searchPanel.setLayout(new FlowLayout());
            searchField = new JTextField(20);
            searchField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    filterTable(searchField.getText().trim());
                }
            });
            searchPanel.add(new JLabel("Search:"));
            searchPanel.add(searchField);

            add(new JScrollPane(table), BorderLayout.CENTER);
            add(searchPanel, BorderLayout.NORTH);

            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }

        private void filterTable(String query) {
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
            table.setRowSorter(sorter);
            if (query.isEmpty()) {
                sorter.setRowFilter(null);
            } else {
                List<RowFilter<Object, Object>> filters = new ArrayList<>();
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    filters.add(RowFilter.regexFilter("(?i)" + query, i));
                }
                sorter.setRowFilter(RowFilter.orFilter(filters));
            }
        }

    // This method allows the controller to access the searchField text
    public String getSearchQuery() {
        return searchField.getText().trim();
    }

    // This method is called by the controller to update the view with new data
    public void updateTable(List<String[]> newData) {
        tableModel.setRowCount(0); // Clear existing data
        for (String[] data : newData) {
            tableModel.addRow(data);
        }
        }
    }
     */
    /*
        // Initialize text area
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

         // Create search panel
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterText(searchField.getText().trim());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterText(searchField.getText().trim());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterText(searchField.getText().trim());
            }
        });
        searchPanel.add(searchField);
        
    private void filterText(String query) {
        if (query.isEmpty()) {
            textArea.setText(""); // Clear the text area if search query is empty
        } else {
            // Filter the ArrayList based on the search query
            List<String> filteredList = dataList.stream()
                    .filter(str -> str.toLowerCase().contains(query.toLowerCase()))
                    .collect(Collectors.toList());

            // Update the text area with the filtered results
            StringBuilder resultText = new StringBuilder();
            for (String str : filteredList) {
                resultText.append(str).append("\n");
            }
            textArea.setText(resultText.toString());
        }
        } */
}
