function insert_spacing(str) {
    const p1 = /([A-Za-z_])([\u4e00-\u9fa5]+)/gi;
    const p2 = /([\u4e00-\u9fa5]+)([A-Za-z_])/gi;
    return str.replace(p1, "$1 $2").replace(p2, "$1 $2")
}