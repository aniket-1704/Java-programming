package hospital;
//Priority queue comparator to decide the 
//emergency patient
import java.util.Comparator;

class PatientPriorityComparator implements Comparator {

	public int compare(Object patient, Object priorityPatient) {

		// comparison code for Patients on the basis of emergency
		Patient p1 = (Patient) patient;
		Patient p2 = (Patient) priorityPatient;
		//default comparator
		// 1 dscending
		// -1 asscending

		//patients with more priority will be treated first
		if (p1.getPriority() < p2.getPriority())
			return 1;
		if (p1.getPriority() > p2.getPriority())
			return -1;
		else {
			//if patients with equal priority the patiend with more id wll be first
			if (p1.getId() < (p2.getId()))
				return -1;
			if (p1.getId() > (p2.getId()))
				return 1;
		}
		return 0;

	}
}