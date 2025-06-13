
package DAO;

import java.io.FileOutputStream;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.JOptionPane;
import model.Trabajador;

public class GeneradorPDF {

    public void generarPDFTrabajadores(List<Trabajador> trabajadores, String nombreArchivo) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();
            Image logo = Image.getInstance(getClass().getResource("/img/icono.png"));
            logo.scaleAbsolute(50, 50);
            document.add(logo);

            Paragraph schoolName = new Paragraph("IEI Niño Jesus de Praga", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL));
            schoolName.setAlignment(Element.ALIGN_LEFT);
            document.add(schoolName);

            document.add(new Paragraph("\n"));

            Paragraph title = new Paragraph("Relacion de trabajadores", new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph("\n"));

            for (int i = 0; i < trabajadores.size(); i++) {

                Paragraph workerTitle = new Paragraph("Trabajador " + (i + 1), new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD));
                workerTitle.setAlignment(Element.ALIGN_LEFT);
                document.add(workerTitle);

                PdfPTable table = new PdfPTable(2);
                table.setWidthPercentage(50);

                Trabajador trabajador = trabajadores.get(i);
                addRowToTable(table, "ID", String.valueOf(trabajador.getId()));
                addRowToTable(table, "Nombre", trabajador.getNombre());
                addRowToTable(table, "Apellido", trabajador.getApellido());
                addRowToTable(table, "Edad", String.valueOf(trabajador.getEdad()));
                addRowToTable(table, "Sexo", trabajador.getSexo());
                addRowToTable(table, "Fecha de Nacimiento", trabajador.getFechNac());
                addRowToTable(table, "Estado Civil", trabajador.getEstCivil());
                addRowToTable(table, "Dirección", trabajador.getDireccion());
                addRowToTable(table, "Distrito", trabajador.getDistrito());
                addRowToTable(table, "Departamento", trabajador.getDepartamento());
                addRowToTable(table, "Email", trabajador.getEmail());
                addRowToTable(table, "Cargo", trabajador.getCargo());
                addRowToTable(table, "Fecha de Ingreso", trabajador.getFechIngreso());
                addRowToTable(table, "Estado", trabajador.getEstado());
                addRowToTable(table, "Tipo de Contrato", trabajador.getTipoContrato());
                addRowToTable(table, "Área de Trabajo", trabajador.getArea());
                addRowToTable(table, "Sueldo", String.valueOf(trabajador.getSueldo()));
                addRowToTable(table, "Nivel de Instrucción", trabajador.getGradoInst());

                document.add(table);

                document.add(new Paragraph("\n"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        JOptionPane.showMessageDialog(null, "El archivo se generó con éxito\nSe encuentra en la carpeta principal del sistema\nNombre: " + nombreArchivo);
    }

    private void addRowToTable(PdfPTable table, String key, String value) {
        PdfPCell cell1 = new PdfPCell(new Paragraph(key));
        PdfPCell cell2 = new PdfPCell(new Paragraph(value));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell1);
        table.addCell(cell2);
    }
}