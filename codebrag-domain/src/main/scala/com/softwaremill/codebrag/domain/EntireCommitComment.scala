package com.softwaremill.codebrag.domain

import org.joda.time.DateTime
import org.bson.types.ObjectId

abstract sealed class CommentBase(val id: ObjectId, val commitId: ObjectId, val authorId: ObjectId, val message: String, val postingTime: DateTime)

case class EntireCommitComment(
                                override val id: ObjectId,
                                override val commitId: ObjectId,
                                override val authorId: ObjectId,
                                override val message: String,
                                override val postingTime: DateTime) extends CommentBase(id, commitId, authorId, message, postingTime)

case class InlineCommitComment(
                                override val id: ObjectId,
                                override val commitId: ObjectId,
                                override val authorId: ObjectId,
                                override val message: String,
                                override val postingTime: DateTime,
                                fileName: String,
                                lineNumber: Int) extends CommentBase(id, commitId, authorId, message, postingTime)
