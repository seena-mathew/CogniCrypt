package crossing.e1.featuremodel.clafer;
import java.io.File;

import java.io.IOException;
import java.util.stream.Collectors;



import org.clafer.ast.AstClafer;
import org.clafer.ast.AstModel;
import org.clafer.ast.AstRef;
import org.clafer.ast.AstUtil;
import org.clafer.collection.Triple;
import org.clafer.javascript.Javascript;
import org.clafer.javascript.JavascriptShell;
import org.clafer.scope.Scope;



import crossing.e1.featuremodel.clafer.ClaferModel;
import static crossing.e1.featuremodel.clafer.ClaferModelUtils.*;


import org.clafer.objective.Objective;

public class TestClafer {

	/**
     * <pre>
     * abstract Object
     *     Name ?
     * abstract Animal : Object
     *     Tail ?
     * abstract Primate : Animal
     *     Bipedal ?
     * Human : Primate
     * Beaver : Animal
     * Sarah : Primate
     * </pre>
     */
	public static void main(String[] args) {
		ClaferModel model = new ClaferModel();
		System.out.println("-------");
		model.getClafersByType("c0_Task").forEach(task -> {
			System.out.println("Task: "+ task);
			model.getClaferProperties(task).forEach(property -> {
				AstRef referenceType = property.getRef();
				System.out.println("property: " + property);
				displayProperties(referenceType.getTargetType());
				//referenceType.getTargetType().getChildren().forEach(a -> displayProperties(a));
				//System.out.println("has property: "+ property + " of type: " + property.getRef() + " card: "+ property.getCard()));
			});
		});
		
		
	}

}