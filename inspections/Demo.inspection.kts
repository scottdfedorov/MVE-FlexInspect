import org.jetbrains.uast.UFile
import org.jetbrains.uast.toUElementOfType

val demo = localInspection { psiFile, localInspection ->
    psiFile.toUElementOfType<UFile>()?.let {
        localInspection.registerProblem(it.sourcePsi, "Debug problem")
    }
}

listOf(
    InspectionKts(
        id = "DemoProblem",
        localTool = demo,
        level = HighlightDisplayLevel.ERROR,
    ),
)