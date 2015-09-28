package net.alexhicks.assemblyvm;

public class Cell {
	public boolean isNumber = false;
	public String data = "";
	public int value = 0;
	public int position = 0;
	public String label = "";
	private String rawData;
	public Cell(String data, int position) {
		this.rawData = data;
		if (data.contains(":")) {
			String[] tokens = data.split(":");
			this.label = tokens[0].trim().toLowerCase();
			data = "";
			for (int i = 1; i < tokens.length; i++) {
				data += ":" + tokens[i];
			}
			data = data.substring(1);
		}
		data = data.trim();
		try {
			this.value = Integer.parseInt(data);
			this.isNumber = true;
		} catch (NumberFormatException ex) {
			this.data = data;
		}
		this.position = position;
	}
	public Cell copy() {
		return new Cell(rawData, position);
	}
}
