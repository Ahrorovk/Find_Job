package com.ahrorovkspace.afkorhackathon.domain.main.model.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\u009d\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0006H\u00d6\u0001J\t\u0010;\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a\u00a8\u0006<"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/GetProjectByCategoriesItem;", "", "categories", "", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/Category;", "comments_count", "", "description", "", "downloads_count", "file", "images", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/Image;", "likes_count", "name", "slug", "tags", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/Tag;", "user", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/User;", "views_count", "id", "(Ljava/util/List;ILjava/lang/String;ILjava/lang/Object;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/User;II)V", "getCategories", "()Ljava/util/List;", "getComments_count", "()I", "getDescription", "()Ljava/lang/String;", "getDownloads_count", "getFile", "()Ljava/lang/Object;", "getId", "getImages", "getLikes_count", "getName", "getSlug", "getTags", "getUser", "()Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/User;", "getViews_count", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class GetProjectByCategoriesItem {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Category> categories = null;
    private final int comments_count = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    private final int downloads_count = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object file = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Image> images = null;
    private final int likes_count = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Tag> tags = null;
    @org.jetbrains.annotations.NotNull
    private final com.ahrorovkspace.afkorhackathon.domain.main.model.project.User user = null;
    private final int views_count = 0;
    private final int id = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesItem copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Category> categories, int comments_count, @org.jetbrains.annotations.NotNull
    java.lang.String description, int downloads_count, @org.jetbrains.annotations.NotNull
    java.lang.Object file, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Image> images, int likes_count, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Tag> tags, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.main.model.project.User user, int views_count, int id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GetProjectByCategoriesItem(@org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Category> categories, int comments_count, @org.jetbrains.annotations.NotNull
    java.lang.String description, int downloads_count, @org.jetbrains.annotations.NotNull
    java.lang.Object file, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Image> images, int likes_count, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Tag> tags, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.main.model.project.User user, int views_count, int id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Category> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Category> getCategories() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getComments_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDownloads_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Image> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Image> getImages() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getLikes_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Tag> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.main.model.project.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.main.model.project.User component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.main.model.project.User getUser() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getViews_count() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
}