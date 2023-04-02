package com.vajay.html;

import com.vajay.html.api.HtmlDocument;
import com.vajay.html.api.HtmlHeader;
import com.vajay.html.api.HtmlLink;
import com.vajay.html.api.HtmlParagraph;
import com.vajay.html.api.HtmlTable;
import com.vajay.html.api.HtmlTableCell;
import com.vajay.html.api.HtmlTableRow;
import com.vajay.html.api.HtmlTitle;

public class Main {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println(
					"A név vagy az email paraméter nem lett megadva!\nAz első paraméter a név, a második az email cím legyen.");
			return;
		}

		String nameParam = args[0];
		String emailParam = args[1];
		String repositoryUrl = "https://github.com/Vajaylm/HtmlGenerator";

		int indentSpaceCount = 5;

		// Create document and components
		HtmlDocument doc = new HtmlDocument(indentSpaceCount);
		doc.addHeadElement(new HtmlTitle(nameParam + " - Teszt Feladat"));

		HtmlHeader header1 = new HtmlHeader("Teszt Feladat", 1);
		doc.addBodyElement(header1);

		HtmlHeader header2 = new HtmlHeader("Nem látszó header (h2)", 2);
		doc.addBodyElement(header2);

		HtmlParagraph paragraph1 = new HtmlParagraph();
		doc.addBodyElement(paragraph1);
		HtmlLink link1 = new HtmlLink("Megoldás");
		link1.addProperty("href", repositoryUrl);
		paragraph1.addChildElement(link1);

		HtmlParagraph paragraph2 = new HtmlParagraph("A feladat elkészítőjének adatai");
		doc.addBodyElement(paragraph2);

		HtmlTable table = new HtmlTable();
		table.addProperty("border", "1px solid black");
		HtmlTableRow row1 = new HtmlTableRow();
		table.addChildElement(row1);
		row1.addChildElement(new HtmlTableCell("Név"));
		row1.addChildElement(new HtmlTableCell(nameParam));
		HtmlTableCell cell1 = new HtmlTableCell("Törlendő cella");
		row1.addChildElement(cell1);

		HtmlTableRow row2 = new HtmlTableRow();
		table.addChildElement(row2);
		row2.addChildElement(new HtmlTableCell("Elérhetőség"));
		row2.addChildElement(new HtmlTableCell(emailParam));
		doc.addBodyElement(table);

		HtmlLink link2 = new HtmlLink("L&P Solutions");
		link2.addProperty("href", "http://lpsolutions.hu");
		doc.addBodyElement(link2);

		HtmlTable table2 = new HtmlTable();
		HtmlTableRow row3 = new HtmlTableRow();
		row3.addChildElement(new HtmlTableCell("Törlendő cella"));
		table2.addChildElement(row3);
		
		// Remove some of the components
		doc.removeBodyElement(header2);
		row1.removeChildElement(cell1);
		doc.removeBodyElement(table2);
		
		System.out.println(doc.toString());
	}

}
