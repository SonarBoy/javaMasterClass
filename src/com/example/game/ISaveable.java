package com.example.game;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
	
	public void read(List<String> values);
	
	public List<String> write();
	
}
