//package ua.service.implementation.editor;
//
//import java.beans.PropertyEditorSupport;
//
//import ua.entity.Komputer;
//import ua.service.KomputerService;
//
//public class KomputerEditor extends PropertyEditorSupport {
//
//	private final KomputerService komputerServiņe;
//
//	public KomputerEditor(KomputerService komputerServiņe) {
//		this.komputerServiņe = komputerServiņe;
//	}
//
//	@Override
//	public void setAsText(String text) throws IllegalArgumentException {
//		Komputer komp = komputerServiņe.findOne1(Integer.valueOf(text));
//		System.out.println(komp);
//		System.out.println(komp.toString());
//		setValue(komp);
//	}
//}