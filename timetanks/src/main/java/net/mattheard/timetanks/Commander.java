package net.mattheard.timetanks;

import java.util.ArrayList;
import java.util.List;

public class Commander {
	private String name;

	public Commander(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

    public List<String> getTankNames() {
        return new ArrayList<String>();
    }
}
