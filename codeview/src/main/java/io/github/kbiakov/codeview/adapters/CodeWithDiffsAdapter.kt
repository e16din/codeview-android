package io.github.kbiakov.codeview.adapters

import android.content.Context
import io.github.kbiakov.codeview.Highlighter
import io.github.kbiakov.codeview.highlight.ColorThemeData
import io.github.kbiakov.codeview.views.DiffModel
import io.github.kbiakov.codeview.views.LineDiffView

/**
 * @class CodeWithDiffsAdapter
 *
 * Code content adapter with ability to add diffs (additions & deletions) in footer.
 *
 * @author Kirill Biakov
 */
open class CodeWithDiffsAdapter : AbstractCodeAdapter<DiffModel> {

    constructor(context: Context, h: Highlighter) : super(context, h)

    /**
     * Default constructor.
     */
    constructor(context: Context, content: String, theme: ColorThemeData) : super(context, content, theme)

    /**
     * Create footer view.
     *
     * @param entity Note content
     * @param isFirst Is first footer
     */
    override fun createFooter(context: Context, entity: DiffModel, isFirst: Boolean) =
            LineDiffView.create(context, entity)
}
