package org.jsp.CollectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
private List<String> names;
private Set<Integer> id;
private Map<Integer, String> details;

public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Set<Integer> getId() {
	return id;
}
public void setId(Set<Integer> id) {
	this.id = id;
}
public Map<Integer, String> getDetails() {
	return details;
}
public void setDetails(Map<Integer, String> details) {
	this.details = details;
}

}
