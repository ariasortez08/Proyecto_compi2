package Frontend;

import javax.swing.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Semantic.SemanticAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.awt.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.antlr.v4.runtime.CharStreams.fromString;
import Pascal.pascalLexer;
import Pascal.pascalParser;


public class MiniPascal extends JFrame {
    private JPanel MainPanel;
    private JTextField NameCompilador;
    private JButton Clear;
    private JButton Run;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JScrollPane Panel2;
    private JScrollPane Panel1;
    private JButton Archivos;

    private String codigoLLVM;

    public MiniPascal ()
    {
        setContentPane(MainPanel);
        setTitle("Mini Pascal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);

        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea1.getText();
                CharStream CS = fromString(texto);

                pascalLexer ps = new pascalLexer(CS);
                CommonTokenStream token = new CommonTokenStream(ps);

                pascalParser pp = new pascalParser(token);

                CustomErrorListener errorListener = new CustomErrorListener();
                pp.addErrorListener(errorListener);
                ParseTree tree = pp.main();

                SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
                semanticAnalyzer.visit(tree);

                List<String> errores = errorListener.getErrores();
                List<String> SemanticErrors = semanticAnalyzer.getErrors();
                List<String> TableErrors = semanticAnalyzer.getErrorsSymbolTable();
                codigoLLVM = semanticAnalyzer.getLLVM();

                if(errores.isEmpty() && SemanticErrors.isEmpty() && TableErrors.isEmpty() )
                {
                    textArea2.setText("");

                    textArea2.setForeground(Color.blue);
                    textArea2.setText("Codigo Correcto!");


                    try {
                        saveToFile("LLVM.ll", codigoLLVM);
                        textArea2.append("\n\nSe generó el archivo LLVM.txt con el codigo intermedio en: Compilador/LLVM.ll");
                    } catch (IOException error) {
                        error.printStackTrace();
                    }
                }else
                {
                    textArea2.setText("");
                    textArea2.setForeground(Color.red);
                    textArea2.setText("Codigo incorrecto!\n");

                    if(!TableErrors.isEmpty())
                    {
                        textArea2.append("Errores semánticos encontrados:\n");
                        for (String error : TableErrors) {
                            textArea2.append(error + "\n");
                        }
                    }

                    if (!errores.isEmpty()) {
                        textArea2.append("Errores sintacticos encontrados:\n");
                        for (String error : errores) {
                            textArea2.append(error + "\n");
                        }
                    }

                    if (!semanticAnalyzer.getErrors().isEmpty()) {
                        textArea2.append("Errores semánticos encontrados:\n");
                        for (String error : semanticAnalyzer.getErrors()) {
                            textArea2.append(error + "\n");
                        }
                    }



                    textArea2.append("\n\nEste es el arbol para este codigo\n"+tree.toStringTree(pp));
                }




            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText("");
                textArea1.setText("");
            }
        });

    }

    public static void main(String[] args)
    {
        new MiniPascal();
    }

    public static void saveToFile(String fileName, String content) throws IOException {
        // Crear un objeto File
        File file = new File(fileName);

        // Usar FileWriter para escribir en el archivo
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }

        System.out.println("Archivo creado: " + file.getAbsolutePath());
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

class CustomErrorListener extends BaseErrorListener {
    private List<String> errores = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errores.add("Error en línea " + line + ":" + charPositionInLine + " - " + msg);
    }

    public List<String> getErrores() {
        return errores;
    }
}

